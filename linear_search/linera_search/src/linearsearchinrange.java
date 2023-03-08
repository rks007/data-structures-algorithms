public class linearsearchinrange {
    public static void main(String[] args) {
        int[] arr={23,54,67,788,65,45,43,32,12};
        System.out.println(linearsearch(arr,65,3,6));
    }
    public  static int linearsearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i=start;i<= end;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
