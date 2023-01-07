class Solution {
    public int maxSubArray(int[] nums) {
        
        int meh = 0 , msf = Integer.MIN_VALUE;
        
        for(int i : nums) {
            meh += i;
            if(meh > msf) {
                msf = meh;
            }
            if(meh <=0 ) {
                meh = 0;
            }
        }
        return msf;
    }
}