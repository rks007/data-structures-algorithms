public class searchinrotatedsortedtarray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(binarysearch(arr,1));
    }
    public static int binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end ){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }
            //if left side is sorted
            if (arr[start] <= arr[mid]){
                if (target >= arr[start] && target <= arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            //check right side is sorted
            else{
                if (target >= arr[mid] && target <= arr[end]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
