class Solution {
    public int maxProfit(int[] prices) {
        
        int buyPrice = prices[0];
        int maxProfit = 0;
        int bestPrice = 0;
        int maxProfitSoFar = 0;

        
        for(int price : prices){

            if(price < buyPrice){
                buyPrice = price;
            }
            if(price - buyPrice > maxProfitSoFar){
                bestPrice = price;
                maxProfitSoFar = price - buyPrice;
            }

        }   

        maxProfit = (maxProfitSoFar > 0) ? maxProfitSoFar : 0;

        return maxProfit;
    }
}


