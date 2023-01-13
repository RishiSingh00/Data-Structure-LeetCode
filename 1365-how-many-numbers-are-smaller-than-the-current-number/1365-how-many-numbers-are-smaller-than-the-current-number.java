class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,0);
        int[] sorted = Arrays.copyOf(nums,nums.length);
        Arrays.sort(sorted);
        
        for(int i = 0 ; i < nums.length ; i++) {
            int j = 0;
            while(j < nums.length && nums[i] > sorted[j++])
                ans[i]++;
        }
        return ans;
    }
}