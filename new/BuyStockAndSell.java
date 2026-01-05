public class BuyStockAndSell {

    public static int buyStockAndSell(int[] arr) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = arr[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
       int [] arr = {2, 7, 5, 3, 1, 6};
     System.out.println(  buyStockAndSell(arr));
    }
}
