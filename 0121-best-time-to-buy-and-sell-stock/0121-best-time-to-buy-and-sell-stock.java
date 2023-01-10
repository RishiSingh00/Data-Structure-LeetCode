class Solution {
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE, profit = 0;
        
        for(int i : prices) {
            if( i < min )
                min = i;
            else
                profit = profit > i - min ? profit : i - min;
        }
        
        return profit;
    }
}