/**
 * Created by sw on 2018-06-04.
 */
public class bestTimeToBuyAndSellStockII {
    static public int maxProfit(int[] prices) {
        //贪心，产生利润就买卖
        int maxPf = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                maxPf += prices[i] - prices[i - 1];
            }
        }
        return maxPf;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        System.out.println(maxProfit(prices));
    }
}
