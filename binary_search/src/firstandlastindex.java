public class firstandlastindex {
    public static void main(String[] args) {
        int[] nums={1,2,3,7,7,7,7,8,8,9,0};
        System.out.println(searchRange(nums,7));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start= indexoftarget(nums,target,true);
        int end= indexoftarget(nums,target,false);


        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static  int indexoftarget(int[] nums,int target,boolean firstindexoftarget){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans=mid;
                if(firstindexoftarget){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
