public class positionininfintearray {
    public static void main(String[] args) {
        int[] arr={1,12,23,33,34,44,45,56,67,78,89,90,98,99};
        int target=34;
        System.out.println(ans(arr,target));
    }
    public static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target > arr[end]){
            int newstart = end + 1;
            //formula for new end= previous end + sizeofarray*2
            end = end + (end - start + 1) * 2;
            start = newstart;
        }
        return  binarysearch(arr,target,start,end);
    }
    public static int binarysearch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid=start + (end - start) / 2;
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
