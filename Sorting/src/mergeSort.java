import java.util.Arrays;

public class mergeSort {
    static void mergesort(int[] arr,int l , int r){
        //base case
        if (l >= r) return;

        int mid = (l + r)/2;
        mergesort(arr,l,mid);
        mergesort(arr, mid + 1 ,r);
        merge(arr,l,mid,r);
    }
    static void merge(int[] arr ,int l,int mid,int r){
        int n1 = mid - l + 1;//condition for  n1 or defining size of n1
        int n2 = r - mid;
        int[] left = new int[n1];//creating array left of size n1
        int[] right = new int[n2];
        int i,j,k;
        //fill the new arrays
        for (i = 0;i < n1 ; i++) left[i] = arr[l+i];
        for (j = 0;j < n2; j++) right[j] = arr[mid + 1 + j];
        i=0;
        j=0;
        k=l;
        while(i < n1 && j < n2){
            if (left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while (i<n1){
            arr[k++] = left[i++];
        }

        while (j<n2) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,5,6,7,3,8,1,4,0};
        mergesort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
