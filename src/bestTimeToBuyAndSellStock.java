/**
 * Created by sw on 2018-06-04.
 */
public class bestTimeToBuyAndSellStock {
    static public int maxProfit(int[] prices) {
        int maxPf = 0;
        for (int i = 0; i < prices.length; i++) {
            int curBuyPrice = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int curSellPrice = prices[j];
                int curPf = curSellPrice - curBuyPrice;
                if (curPf > maxPf) {
                    maxPf = curPf;
                }
            }
        }
        return maxPf;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
