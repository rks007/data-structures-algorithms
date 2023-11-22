import java.util.ArrayList;
import java.util.List;

public class leftSideView {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static void preOrder(Node root,List<Integer> ans,int level){
        if(root == null) return;
        ans.set(level - 1,root.val);
        preOrder(root.right,ans,level + 1); //for left view we will call root.right first and for right view we will call root.left first
        preOrder(root.left,ans,level + 1);
    }
    public static int height(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static List<Integer> leftView(Node root){
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        int level = height(root) + 1;
        for (int i = 0;i < level;i++){
            ans.add(0);
        }
        preOrder(root,ans,1);
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(8);
        Node h = new Node(9);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        e.left = g;
        g.right = h;

        System.out.println(leftView(root));
    }
}
