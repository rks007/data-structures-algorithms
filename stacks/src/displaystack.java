import java.util.Stack;

public class displaystack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        Stack<Integer> gt = new Stack<>();
        while(st.size() > 0){
            gt.push(st.pop());
        }
        while (gt.size() > 0){
            System.out.print(" "+gt.peek());
            st.push(gt.pop());
        }

    }
}
