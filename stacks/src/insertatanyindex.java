import java.util.Stack;

public class insertatanyindex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack<Integer> temp = new Stack<>();
        while(st.size() > 0){
            temp.push(st.pop());
        }
        System.out.println(temp);
        st.push(1);

        while(temp.size() > 0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
