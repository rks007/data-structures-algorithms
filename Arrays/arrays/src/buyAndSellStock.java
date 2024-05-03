package arrays.src;

public class buyAndSellStock {//leetcode 121
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int ans = buySell(prices);
        System.out.println(ans);

    }
    private static int buySell(int[] prices){//dry run for better understanding
        if(prices.length < 2){
            return 0;
        }

        int maxProfit = 0;
        int buyingPrice = prices[0];

        for (int i = 1; i < prices.length;i++){
            if (prices[i] > buyingPrice){
                maxProfit = Math.max(maxProfit, prices[i] - buyingPrice);
            }
            else{//if prices[i] is smaller than or equal to the buyingPrice then please update the buyingprice = prices[i]
                buyingPrice = prices[i];
            }
        }
        return maxProfit;

    }
}
