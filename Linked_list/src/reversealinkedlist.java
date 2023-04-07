public class reversealinkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public static Node reverselist(Node head){
        if (head.next == null) return head; //base case
        Node newhead = reverselist(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
    public static void display(Node head){
        if(head == null){
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node displayrevlist = reverselist(a); //why node displayrevlist instead of int because node cannot be converted to int
        display(displayrevlist);

    }
}
