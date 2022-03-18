public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        int pro = buySell(a);
        System.out.println(pro);
    }

    public static int buySell(int prices[]){
        int min = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            profit = Math.max(profit, prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
}
