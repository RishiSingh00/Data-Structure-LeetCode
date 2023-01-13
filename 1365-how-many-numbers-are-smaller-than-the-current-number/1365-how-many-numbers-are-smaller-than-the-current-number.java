class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] map = new int[101];
        
        for(int i : nums)
            map[i]++;
        
        for(int i = 1 ; i < 101 ; i++) {
            map[i] += map[i-1];
        }
        int[] res = new int[nums.length];
        
        for(int i = 0 ; i < nums.length ; i++) {
            res[i] = nums[i] == 0 ? 0 : map[nums[i] - 1];
        }
        return res;
    }
}