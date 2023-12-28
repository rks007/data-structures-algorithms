import java.util.PriorityQueue;

public class connectingNRopesMinCost { //gfg
    public static long minCost(long arr[], int n){ //n is the length of the array
        long cost = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0;i < n;i++){ //add all elements in priority queue
            pq.add(arr[i]);
        }
        while(pq.size() > 1){ //this while condition is imp because when you dry run the code you will find in the there is one element left so if code run on one element the it will give null pointer error please put this condition

            long a = pq.peek();
            pq.remove();

            long b = pq.peek();
            pq.remove();

            long sum = a + b;

            pq.add(sum);//imp step after calculating the sum

            cost += sum;
        }
        return cost;
    }

    public static void main(String[] args) {
        long[] arr = {4,3,2,6};
        Long ans = minCost(arr, arr.length);
        System.out.println(ans); //29
    }
}
