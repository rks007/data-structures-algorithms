package arrays.src;

public class trappingRainWater1 {//leetcode 42
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};

        int ans = trap(height);

        System.out.println(ans);

    }
    private static int trap(int[] height){//dry run for better understanding

        int[] leftMaxArr = new int[height.length];//we make an array where we have store the maximum height from left for each index
        int maxLeft = -1;
        int[] rightMaxArr = new int[height.length];//we make an array where we have store the maximum height from right to left for each index
        int maxRight = -1;

        for(int i = 0; i < height.length;i++){//process of storing, prefix
            maxLeft = Math.max(maxLeft, height[i]);
            leftMaxArr[i] = maxLeft;
        }

        for(int i = height.length - 1; i >= 0;i--){//process of storing, suffix
            maxRight = Math.max(maxRight, height[i]);
            rightMaxArr[i] = maxRight;
        }
        int ans = 0;
        for (int i = 0; i < height.length ; i++){//now just calculate each block capacity to store the rain water

            ans += Math.min(leftMaxArr[i], rightMaxArr[i]) - height[i];//main crux, please dry run
        }

        return ans;
    }
}
