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
         }
         void display(){
             Node temp = head;
             while(temp != null){
                 System.out.print(temp.data+" ");
                 temp = temp.next;
             }
         }
         int size(){
             Node temp = head;
             int count = 0;
             while (temp != null){
                 count++;
                 temp = temp.next;
             }
             return count;
         }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertatbeg(3);
        ll.insertatbeg(2);
        ll.insertatend(4);
        ll.insertatend(5);
        ll.display();
        System.out.println(ll.size());
    }
}
