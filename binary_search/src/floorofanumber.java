public class floorofanumber {
    public static void main(String[] args) {
        int[] arr={10,12,23,34,45,56,67,78,89,90,99};
        System.out.println(floorofnumber(arr,22));
    }
    static int floorofnumber(int[] arr,int target){
        if (target<arr[0]){
            return-1;
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
        return end;
    }
}
