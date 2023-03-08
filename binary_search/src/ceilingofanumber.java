public class ceilingofanumber {
    public static void main(String[] args) {
        int[] arr={12,23,34,45,56,67,78,89,90,99};
        System.out.println(ceilingofanumber(arr,79));
    }
    public static int ceilingofanumber(int[] arr,int target){
        //ceiling means number = or smallest number which is greater than target
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
