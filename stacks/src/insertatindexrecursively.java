import java.util.Stack;

public class insertatindexrecursively {
    public static void insertrecursively(Stack<Integer> st,int idx,int element){
        //base case
        if(st.size() == idx + 1){
            st.push(element);
            return;
        }

        int top = st.pop();
        insertrecursively(st,idx,element);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(5);
        st.push(4);
        st.push(2);
        st.push(1);

        insertrecursively(st,2,3);

        Stack<Integer> gt = new Stack<>();
        while(st.size() > 0){
            gt.push(st.pop());
        }
        while (gt.size() > 0){
            System.out.print(gt.peek()+" ");
            st.push(gt.pop());
        }
    }
}
