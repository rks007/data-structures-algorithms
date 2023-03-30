public class Basics {
    public static class Node {
        int data;
        Node next;//address of next node

        public Node(int data) { //constructor
            this.data = data;
        }
    }
    //display a linked list
    public static void Display(Node head){
        
        while(head != null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    //display a linked list in reverse
    public static void Displayreverse(Node head){
        if (head == null) return; //base case
        Displayreverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void Displayrecursively(Node head){
        if (head == null) return; //base case
        System.out.print(head.data+" ");
        Displayrecursively(head.next);
    }
    //print lenght of a linked list
    public static int Lenghtoflist(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Display(a);
        System.out.println();
        Displayrecursively(a);
        System.out.println();
        Displayreverse(a);
        System.out.println();
        System.out.println(Lenghtoflist(a));
    }
}