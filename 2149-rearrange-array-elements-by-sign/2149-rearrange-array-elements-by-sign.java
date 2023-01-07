class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] res = new int[nums.length];
        
        int pIdx = 0;
        int nIdx = 1;
        
        for(int i=0; i< nums.length ; i++) {
            
            if( nums[i] > 0 ) {
                res[pIdx] = nums[i];
                pIdx+=2;
            }
            else {
                res[nIdx] = nums[i];
                nIdx+=2;
            }
        }
        
        return res;
    }
}