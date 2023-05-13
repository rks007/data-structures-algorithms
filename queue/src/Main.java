import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void display(Queue<Integer> q){
        Queue<Integer> qe = new LinkedList<>();
        while(q.size() > 0){
            System.out.print(q.peek()+" ");
            qe.add(q.remove());
        }
        while(qe.size() > 0){
            q.add(qe.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
        System.out.println(q.size());
        q.remove();
        System.out.println(q.peek());
        display(q);
    }
}