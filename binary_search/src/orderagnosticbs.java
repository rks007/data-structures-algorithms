public class orderagnosticbs {
    public static void main(String[] args) {
        //int[] arr={12,34,45,56,67,78,89,90,94,98,99};   //ascending order array
        int[] arr={90,89,78,67,56,45,34,23,22,12,11,10};  //descending order array
        System.out.println(orderagnosticBS(arr,89));
    }
    static int orderagnosticBS(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        //check for ascending or not
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if (target==arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            //for descending order
            else {
                if (target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
