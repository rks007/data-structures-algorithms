import java.sql.Struct;

public class arrayimplementationofstack {
    public static class Stack{
        private int[] arr = new int[10];
        int idx = 0;

        boolean isEmpty(){
            if (idx == 0) return true;
            else return false;
        }

        boolean isFull(){
            if (idx == arr.length)return true;
            else return false;
        }

        int capacity(){
            return arr.length;
        }

        int size(){
            return idx;
        }

        void push(int x){
            if (isFull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek(){
            if (isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop(){
            if (isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx -1];
            arr[idx -1] = 0;
            idx--;
            return top;
        }

        void display(){
            for (int i = 0;i < idx;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(6);
        st.push(5);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
    }
}
