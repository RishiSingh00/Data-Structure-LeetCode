class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int i = 0, j = 0, result = 0;
        int Product = 1;
        while(j <= nums.length-1 ) {
            Product *= nums[j];
            while(i <= j && Product >= k){
                Product /= nums[i++];
                
            }
            result += j - i + 1;
            j++;
        }
        return result;
    }
}