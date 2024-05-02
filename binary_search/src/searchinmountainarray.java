public class searchinmountainarray {
    public static void main(String[] args) {
        int[] arr = {0,1,3,5,4,2};
        System.out.println(peakindex(arr));
    }
    public static int peakindex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            //in binary search we gnerally give <= condition but here we give only < because of some reasons and i think i already know the raesons or you have any confusion just dry run the solution
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){//dry run
                end = mid;
            }
            else { //dry run
                start = mid + 1;
            }
        }
        return start;//if you dont know the reson to return the start then please dry run the whole solution to understand the logic behind
    }
}




