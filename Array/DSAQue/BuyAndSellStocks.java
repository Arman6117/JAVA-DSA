package Array.DSAQue;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int profit = calcMaxProfit(prices);
        System.out.printf("Maximum profit is %d", profit);
    }

    public static int calcMaxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (buyPrice < price) {
                int p = price - buyPrice;
                maxProfit = Math.max(maxProfit, p);
            } else {
                buyPrice = price;
            }
        }
        return  maxProfit;
    }
}
