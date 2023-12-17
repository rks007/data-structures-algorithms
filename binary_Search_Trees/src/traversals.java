import java.util.*;
public class traversals {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static Node constructbfs(String[] arr){
        int n = arr.length;
        int x = Integer.parseInt(arr[0]);
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;//because we have taken 0th element as root node so start looping from 2nd
        while(i < n - 1){ // i will go to the 2nd last element
            Node temp = q.remove();
            Node left = new Node(0);
            Node right = new Node(0);

            if (arr[i].equals("")) left = null;
            else{
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if (arr[i + 1].equals("")) right = null;
            else{
                int r = Integer.parseInt(arr[i + 1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2; //imp step
        }
        return root;
    }
    public static void main(String[] args) {
        String[] arr = {"10","5","15","2","8","12","17"}; // "" denotes null
        int[] array = new int[arr.length];

        Node root = constructbfs(arr);
        preOrder(root);
        System.out.println();
        inOrder(root,array,0);
        System.out.print(Arrays.toString(array));
        System.out.println();
        postOrder(root);
    }

    private static void postOrder(Node root) {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
//    private static void inOrder(Node root,int[] array,int i) {
//        if(root == null) return;
//        inOrder(root.left,array,i);
//        array[i] = root.val;
//        i++;
//        inOrder(root.right,array,i);
//
//    }
    private static int inOrder(Node root, int[] array, int i) { //this function is to fill array with the sorted values of bst through inorder traversal because inorder always gives sorted list in bst
        if (root == null) return i;
        i = inOrder(root.left, array, i);
        array[i] = root.val;
        i++;
        return inOrder(root.right, array, i);
    }

    private static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

}