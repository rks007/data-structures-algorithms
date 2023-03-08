public class Main {
    public static void main(String[] args) {
        int[] arr={23,54,67,788,65,45,43,32,12};
        int ans=linearsearch(arr,65);
        System.out.println("element found on the index is "+ ans );
    }
    public  static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i=0;i< arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}