import java.util.Stack;

public class displaystack {
    public static void revstackrecursively(Stack<Integer> st){ // display stack in reverse using recursion
        //base case
        if(st.size() == 0) return;

        int top = st.pop();
        System.out.print(top+" ");
        revstackrecursively(st);
        st.push(top);
    }
    public static void displastackrecursively(Stack<Integer> st){
        //base case
        if(st.size() == 0) return;

        int top = st.pop();
        displastackrecursively(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println("printing stack iteratively");
        Stack<Integer> gt = new Stack<>();
        while(st.size() > 0){
            gt.push(st.pop());
        }
        while (gt.size() > 0){
            System.out.print(gt.peek()+" ");
            st.push(gt.pop());
        }
        System.out.println();
        System.out.println("printing reverse stack using recursion");
        revstackrecursively(st);
        System.out.println();
        System.out.println("printing stack using recursion");
        displastackrecursively(st);
    }
}
