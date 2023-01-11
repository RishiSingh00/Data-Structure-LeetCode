class Solution {
    public int findKthPositive(int[] arr, int k) {
       
        
        int s = 0, e = arr.length - 1;
        
        if(k < arr[0])
            return k;
        
        while(s <= e) {
            int mid = (int) (s+e) / 2;
            int missing = arr[mid] - (mid+1);
            if( missing >= k && arr[mid-1] - (mid) < k) {
                return arr[mid] - (missing - k) - 1;
            }
            
            if(missing >= k)
                e--;
            else
                s++;
            
        }
        
        
        
        
        return arr[arr.length - 1] + (k - (arr[arr.length - 1] - (arr.length))) ;
        
    }
}