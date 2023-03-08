public class frogjump {
    public static void main(String[] args) {
        int[] arr = {10,30,40,20};
        System.out.println(minimumcost(arr, arr.length, 0));

    }
    static int minimumcost(int[] arr,int l,int idx){
        //base case
        if (idx == l-1) return 0;

        // option ie to jump 1 step
        int op1 = Math.abs(arr[idx] - arr[idx + 1]) + minimumcost(arr,l,idx + 1);
        //if the idx will ath the secondlast element then it will not able to jump 2 step forward so thats why
        if (idx == l-2) return op1;
        // option ie to jump 2 step
        int op2 = Math.abs(arr[idx] - arr[idx + 2]) + minimumcost(arr,l,idx + 2);
        //for returning the minimum of the above option
        return Math.min(op1,op2);
    }
}
