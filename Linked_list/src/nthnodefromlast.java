public class nthnodefromlast {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    public static Node getnode(Node head,int nth){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head; // again assigning temp to head because in finding size the temp has gone to the end of the linked list
        int pos = (size - nth + 1);
        for (int i = 1;i <= pos - 1;i++){ //dry run for understanding i use pos - 1
            temp = temp.next;
        }
        return temp;
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

        Node q = getnode(a,2);
        System.out.println(q.data);
    }
}
