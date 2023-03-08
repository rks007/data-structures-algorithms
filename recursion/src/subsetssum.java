public class subsetssum {
    public static void main(String[] args) {
        int[] arr = {2,4,5};
        sumofsubset(arr, arr.length, 0,0);

    }
    static void sumofsubset(int[] arr,int size,int idx,int sum){
        //base case
        if (idx >=size ){
            System.out.println(sum);
            return;
        }
        //include a integer
        sumofsubset(arr,size,idx + 1,sum + arr[idx]);
        //exclude that integer
        sumofsubset(arr,size,idx+1,sum);
    }
}
