import java.util.*;

public class bfsDfs {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void display(Node root){
        if (root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void bfs(Node root){
        Queue<Node> q  = new LinkedList<>();
        if (root != null) q.add(root);
        while (!q.isEmpty()){
            Node temp = q.peek();
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
    public static List<Integer> dfs(Node root){
        List<Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.add(root);
        while (!st.isEmpty()){
            Node temp = st.peek();
            if (temp.left != null){
                st.push(temp.left);
                temp.left = null;
            }
            else{
                st.pop();
                list.add(temp.val);
                if (temp.right != null) st.push(temp.right);
            }
        }
        return list;
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
        b.left = e;
        b.right = f;

        display(root);
        System.out.println();
        System.out.println("bfs");
        bfs(root);
        System.out.println();
        System.out.println(dfs(root));
    }
}
