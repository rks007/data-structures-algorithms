import java.util.Comparator;
import java.util.PriorityQueue;

public class medianOfTheStreams {
    private static void add(PriorityQueue<Integer> leftPq,PriorityQueue<Integer> rightPq,int element){
        if (leftPq.isEmpty()){ //if left queue is empty
            leftPq.add(element);
        }
        else {
            if (element < leftPq.peek()) {//agar left me element jana hai
                if (leftPq.size() == rightPq.size()){
                    leftPq.add(element);
                }
                else{
                    rightPq.add(leftPq.remove());
                    leftPq.add(element);
                }

            }
            else{ //agar element right mein jaega
                if (leftPq.size() == rightPq.size()){
                    leftPq.add(rightPq.remove());
                    rightPq.add(element);
                }
                else{
                    rightPq.add(element);
                }
            }
        }
    }
    private static double findMedian(PriorityQueue<Integer> leftPq,PriorityQueue<Integer> rightPq){ //making it double type because we want point value also when we will calculate mean of two numbers
        if (leftPq.isEmpty()){
            return -1;
        }
        else if(leftPq.size() == rightPq.size()){
            return (double) (leftPq.peek() + rightPq.peek()) / 2;//here we typcasted or we can just just write 2.0 to capture point values instead of(double)
        }
        else{
            return leftPq.peek();
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> leftPq = new PriorityQueue<>(Comparator.reverseOrder());//max heap
        PriorityQueue<Integer> rightPq = new PriorityQueue<>();//min heap
        add(leftPq,rightPq,15);
        System.out.println(findMedian(leftPq,rightPq));
        add(leftPq,rightPq,10);
        System.out.println(findMedian(leftPq,rightPq));
        add(leftPq,rightPq,5);
        System.out.println(findMedian(leftPq,rightPq));
        add(leftPq,rightPq,20);
        System.out.println(findMedian(leftPq,rightPq));
        add(leftPq,rightPq,25);
        System.out.println(findMedian(leftPq,rightPq));

    }
}
