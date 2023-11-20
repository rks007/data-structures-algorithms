import java.util.LinkedList;
import java.util.Queue;

public class constructTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static int height(Node root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static void nthLevel(Node root, int n){ //printing nodes of nth level from left to right
        if (root == null) return;
        if (n == 1){
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
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
        String[] arr = {"1","2","3","4","5","","6","","7","","","8","","","","9",""};

        Node root = constructbfs(arr);

        int levelofBinarytree = height(root) + 1;
        for (int i = 1; i <= levelofBinarytree;i++){
            nthLevel(root,i);
        }

    }
}
