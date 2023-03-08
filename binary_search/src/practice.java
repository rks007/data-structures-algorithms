public class practice {
    //infinite array
    public static void main(String[] args) {
        int[] arr={1,11,12,13,14,22,23,34,45,55,56,66,67,77,78,88,89,90,98,99};
        int target=22;
        System.out.println(ans(arr,target));
    }
    public static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            end = end +(end - start + 1)*2;
            start = newstart;
        }
        return binarysearch(arr,target,start,end);
    }
    public static int binarysearch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }
}
