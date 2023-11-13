public class sizeMaxSumHeight {
    public static class Node{
        int val;
        Node left;
        Node right;


        public Node(int val) {
            this.val = val;
        }
    }
    public static int Size(Node root){//size of binary tree
        if (root == null) return 0;
        return 1 + Size(root.left) + Size(root.right);
    }
    public static int Sum(Node root){ // sum of all nodes in binary tree
        if (root == null) return 0;
        return root.val + Sum(root.left) + Sum(root.right);
    }
    public static int product(Node root){
        if (root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    public static int max(Node root){ // maximun node value in binary tree
        if (root == null) return Integer.MIN_VALUE; // for negative numbers
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = min(root.left);
        int c = min(root.right);
        return Math.min(a,Math.min(b,c));
    }
    public static int height(Node root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static void preOrder(Node root){//preorder traversal
        if (root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void nthLevel(Node root,int n){ //printing nodes of nth level
        if (root == null) return;
        if (n == 1){
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        e.left = f;
        preOrder(root);
        System.out.println();
        int size = Size(root);
        System.out.println("size-> "+size);
        int sum = Sum(root);
        System.out.println("sum-> "+sum);
        System.out.println("maximum node-> "+max(root));
        System.out.println("height-> "+height(root));
        System.out.println("min-> "+min(root));
        System.out.println("product-> "+product(root));
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        nthLevel(root,2);
        System.out.println();
        int levelofBinarytree = height(root) + 1;
        System.out.print("level order traversal without queue-> ");
        for (int i = 1; i <= levelofBinarytree;i++){
            nthLevel(root,i);
        }
    }
}
