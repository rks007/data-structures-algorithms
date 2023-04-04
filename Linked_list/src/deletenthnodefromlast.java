public class deletenthnodefromlast {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    public static Node deletenode(Node head,int nth) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= nth;i++){
            fast = fast.next;
        }
        if (fast == null){ //covering the edge case of delete last(original head ) element from backwards
            head = head.next;
            return head; //because we have to change the head in the main function also
        }
        while(fast.next != null){ //because we need the previous element of the target element
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
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

        display(a);
        a = deletenode(a,4);
        System.out.println();
        display(a);

    }
}
