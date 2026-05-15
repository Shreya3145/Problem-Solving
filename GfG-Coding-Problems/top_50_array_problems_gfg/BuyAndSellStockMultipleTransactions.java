package top_50_array_problems_gfg;

public class BuyAndSellStockMultipleTransactions {

    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        System.out.println(res);
    }

}
