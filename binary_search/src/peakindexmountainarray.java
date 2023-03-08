public class peakindexmountainarray {
    public static void main(String[] args) {
        int[] arr = {0,1,3,5,4,2};
        System.out.println(peakindex(arr));
    }
    public static int peakindex(int[] arr){
        int start = 0;
        int end = arr.length;
        while (start < end){
            //in binary search we gnerally give <= condition but here we give only < because of some reasons and i think i already know the raesons
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
