package arrays.src;

public class containerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(height);
        System.out.println(ans);

    }
    public static int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n - 1;
        int ans = 0;
        while(i < j){
            if(height[i] <= height[j]){
                ans = Math.max(ans, height[i] * (j - i));
                i++;
            }else{
                ans = Math.max(ans, height[j] * (j - i));
                j--;
            }
        }

        return ans;
    }
}
