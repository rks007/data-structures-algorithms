public class nthnodefromlastbyslowandfast {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    public static Node getnode(Node head,int nth) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= nth;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node q = getnode(a,3);
        System.out.println(q.data);
    }
}
