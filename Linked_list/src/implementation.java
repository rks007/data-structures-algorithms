public class implementation {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertatend(int val){  //why not public static because it is inside the the public static class
             Node temp = new Node(val);
             if (head == null){
                 head = temp;
                 tail = temp;
             }
             else {
                 tail.next = temp;
                 tail = temp;
             }
             size++;
         }
         void insertatbeg(int val){
             Node temp = new Node(val);
             if (head == null){
                 head = temp;
                 tail = temp;
             }
             else{
                 temp.next = head;
                 head = temp;

             }
             size++;
         }
         //insert at any given index
         void insertat(int idx , int val){
            Node t = new Node(val);
            Node temp = head;
            if (idx == size){
                insertatend(val);
                return;
            } else if (idx == 0) {
                insertatbeg(val);
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("wrong input");
                return;
            }
             for (int i = 1;i <= idx - 1;i++){
                temp = temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
         }
         //delete at any index
        void deleteat(int idx){
            if (idx == 0){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for (int i = 1;i <= idx -1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
         //get element method
        int getat(int idx){
            Node temp = head;
            for (int i = 1;i <= idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
         void display(){
             Node temp = head;
             while(temp != null){
                 System.out.print(temp.data+" ");
                 temp = temp.next;
             }
         }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertatbeg(3);
        ll.insertatbeg(2);
        ll.insertatbeg(1);
        ll.insertatend(4);
        ll.insertatend(5);
        ll.insertatend(7);
        ll.insertat(2,6);
        ll.deleteat(5);
        System.out.println(ll.tail.data);
        ll.display();
        System.out.println();
        System.out.println(ll.getat(2));
        System.out.println(ll.size);
    }
}
