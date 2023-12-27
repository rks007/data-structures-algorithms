import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static class Student{
        String name;
        Integer rollNo;
        Integer marks;
        String dob;
    }
    public static class StudentComparator implements Comparator<Student>{
        //now overriding
        public int compare(Student s1,Student s2){
            if (s1.marks > s2.marks){
                return 1; //return s1 beacuse it is greater
            } else if (s2.marks > s1.marks) {
                return -1; //return s2 because it is comes out to be greater
            }
            else { //if both are equal
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //by default it creates a min heap
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); //after implementing with comparator now it is a max heap type priority queue
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);
        System.out.println(pq.peek());//for getting the top element of heap of priority queue
        pq.remove();
        System.out.println(pq); //5 will get deleted

        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(new StudentComparator());
        Student harsh = new Student();
        harsh.name = "Harsh";
        harsh.rollNo = 14;
        harsh.marks = 97;
        harsh.dob = "12-10-2001";
        Student raghav = new Student();
        raghav.name = "Raghav";
        raghav.rollNo = 3;
        raghav.marks = 99;
        raghav.dob = "10-3-2000";
        studentPriorityQueue.add(harsh);
        studentPriorityQueue.add(raghav);
        System.out.println(studentPriorityQueue.peek().name);
        System.out.println(studentPriorityQueue.peek().rollNo);
        System.out.println(studentPriorityQueue.peek().marks);
        System.out.println(studentPriorityQueue.peek().dob);
    }
}
