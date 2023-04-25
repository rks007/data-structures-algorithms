public class linkedlistimplementationofstacks {
    public static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data = data;
        }
    }
    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int peek(){
            if (size == 0){
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }

        int pop(){
            if (size == 0){
                System.out.println("stack is empty");
                return -1;
            }
            int z = head.data;
            head = head.next;
            size--;
            return z;
        }

        int size(){
            return size;
        }

        void displayrecursive(Node h){
            if (h == null) return;

            displayrecursive(h.next);
            System.out.print(h.data+" ");
        }

        void display(){
            displayrecursive(head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.size());
        st.display();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.display();
    }
}
