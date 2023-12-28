import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class sumBetweenK1thsmallestandK2thsmallest {
    public static void main(String[] args) {
        //int[] arr = {200,100,80,30,50,150,70,60};//ans = 150
        int[] arr = {20,8,22,4,12,10,14}; //ans = 26
        int n = arr.length;
        System.out.println("brute force method");
        int ans = summ(arr,n,3,6);
        System.out.println(ans);
        System.out.println("better approach");
        int ans2 = sum(arr,n,3,6);//heap approach
        System.out.println(ans);
    }

    private static int summ(int[] arr, int n, int k1, int k2) { //brute approach
        Arrays.sort(arr);
        int sum = 0;
        for (int i = k1; i < k2 - 1;i++){
            sum += arr[i];
        }
        return sum;
    }

    private static int sum(int[] arr, int n,int k1,int k2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //imp to create a max heap

        for (int i = 0;i < n;i++){//add values to heap
            pq.add(arr[i]);

            if (pq.size() > k2 - 1){//add only values before k2,
                pq.remove();

            }
        }
        int totalSum = 0;

        while(pq.size() > k1){
            totalSum += pq.remove();
        }

        return totalSum;
    }
}
