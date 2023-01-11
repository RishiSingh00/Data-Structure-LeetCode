class Solution {
    public int findKthPositive(int[] arr, int k) {
       
        
        int i = 0;
        
        if(k < arr[0])
            return k;
        
        k -= arr[0] - 1;
        
        while( k > 0 && i < arr.length-1 ) {
            if( arr[i+1]-arr[i] != 1) {
                
                if(arr[i]+k < arr[i+1])
                    return arr[i]+k;
                
                k -= arr[i+1]-arr[i]-1;
            }
            i++;
        }
        
        
        return arr[i] + k;
        
    }
}