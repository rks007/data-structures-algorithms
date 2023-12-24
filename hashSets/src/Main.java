import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();

        st.add("james"); //adding value
        st.add("scott");
        System.out.println(st);

        System.out.println(st.contains("james")); //present or not

        System.out.println(st.size());

        st.remove("james"); // for removing

        st.add("morris");
        st.add("mike");
        System.out.println(st.contains("james"));

        for ( String e : st ) { //for traversing a set
            System.out.print(e+" ");
        }

    }
}