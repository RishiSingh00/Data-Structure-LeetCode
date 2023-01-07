class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] res = new int[nums.length];
        
        int pIdx = -1;
        int nIdx = -1;
        int resIdx = 0;
        for(int i=0; i< nums.length ; i++) {
            
            if( i % 2 == 0 ) {
                while(nums[++pIdx] < 0);
                res[resIdx++] = nums[pIdx];
            }
            else {
                while(nums[++nIdx] > 0);
                res[resIdx++] = nums[nIdx];
            }
        }
        
        return res;
    }
}