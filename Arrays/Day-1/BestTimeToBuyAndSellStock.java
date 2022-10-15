class Solution {
    public int maxProfit(int[] prices) {
        int mprofit=0;
        int buy=0;
        int sell=1;
        while(sell < prices.length )   //buy stock
        {
           if(prices[sell]>prices[buy]){
               int profit=prices[sell]- prices[buy];
               mprofit=Math.max(mprofit, profit);
           } 
            else{
                buy=sell;
            }
            sell++;
            
        }
        return mprofit;
      
    }
}