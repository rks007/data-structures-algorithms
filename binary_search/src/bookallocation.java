public class bookallocation {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        System.out.println(minimumpages(arr));
    }
    static int minimumpages(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int start = arr[0];
        int end = sum;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (allocationispossible(arr, 2, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;//we can also return res;
    }


    static boolean allocationispossible(int[] arr,int students,int barrier){
        int pages = 0;
        int allocstudents = 1;
        //now iterate the array
        for (int i = 0;i < arr.length ; i++ ){
            if (arr[i] > barrier) return false;
            if (pages + arr[i] > barrier){
                allocstudents +=1;
                pages += arr[i];
            }
            else{
                pages += arr[i];
            }
        }
        if(allocstudents > students){
            return false;
        }
        else {
            return true;
        }
    }
}
