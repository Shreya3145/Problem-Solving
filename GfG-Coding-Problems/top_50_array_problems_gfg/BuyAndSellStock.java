package top_50_array_problems_gfg;
public class BuyAndSellStock {
    
    public static void main(String[] args) {
     int[] prices = {7, 10, 1, 3, 6, 9, 2};
     int min = prices[0];
     int res = 0;

     for(int i = 1; i < prices.length - 1; i ++){
        min = Math.min(min, prices[i]);

        res = Math.max(res, prices[i] - min);
     }
     System.out.println(res);
    }
    
}
