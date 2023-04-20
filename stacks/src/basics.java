import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.size());
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st.size());
        System.out.println(st.peek());;//peek can acces the topmost element only
        st.pop();//you can pop from top most element
        System.out.println(st);

        //then how to acces elemnt other than topmost element
        while(st.size() > 1){
            st.pop();
        }
        System.out.println(st.peek());
    }
}