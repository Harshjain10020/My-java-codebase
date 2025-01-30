public class stock {

public static int buySellstock(int prices[]){
    int buypr = Integer.MAX_VALUE;
    int maxprofit =  0;
    for (int i = 0; i < prices.length; i++) {
        if(buypr < prices[i]){
            int profit = prices[i] - buypr;
            maxprofit = Math.max(maxprofit, profit);
        }else{
            buypr = prices[i];
        }
    }
    System.out.println(buypr);
    System.out.println(); 
    return maxprofit;
}

    public static void main(String[] args) {
        int prices[] = { 7,1,5,3,6,4};
        System.out.println(buySellstock(prices));
    }
}
