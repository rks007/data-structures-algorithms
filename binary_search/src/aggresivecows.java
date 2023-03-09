import java.util.Arrays;

public class aggresivecows {
    static int binarysearch(int[] arr){
        int start = 1;
        int end = arr[arr.length - 1] - arr[0];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (canplacecows(arr,3,mid)){
                int ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return end;//after the condition break of binary search the start will be at the answer
    }
    static boolean canplacecows(int[] arr,int cows,int dist){
        int countofcows = 1;
        int cowplacedat = arr[0];
        for (int i = 1;i < arr.length - 1;i++){
            if ((arr[i] - cowplacedat) >= dist){
                countofcows++;
                cowplacedat = arr[i];
            }
            //if(countofcows == cows) return true;
        }
        if(countofcows == cows) return true;
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,9,8};
        Arrays.sort(arr);
        System.out.println(binarysearch(arr));
    }
}
