class Solution {
    public int maximumDifference(int[] nums) {
        int s = 0,e = 1;
        int diff = -1;
        while(e < nums.length) {
            if(nums[s] > nums[e]) {
                s = e;
            }
            else if(nums[s] < nums[e]) {
                diff = nums[e] - nums[s] > diff ? nums[e] - nums[s] : diff;   
            }
            e++;
        }
        return diff;
    }
}