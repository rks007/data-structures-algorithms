import java.util.LinkedList;
import java.util.Queue;

public class deletionOfNode {
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
        String[] arr = {"50","20","60","17","34","55","89","10","","28","","","","70","","","14"}; // "" denotes null
        int[] array = new int[arr.length];

        Node root = constructbfs(arr);
        preOrder(root);
        delete(root,14);
        System.out.println();
        preOrder(root);


    }

    private static void delete(Node root, int target) {
        if (root == null) return;
        if(root.val > target){//go left
            if(root.left == null) return;
            if(root.left.val == target) root.left = null;
            else delete(root.left,target);
        }
        else{ //go right
            if(root.right == null) return;
            if(root.right.val == target) root.right = null;
            else delete(root.right,target);
        }
    }


    public static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
}
