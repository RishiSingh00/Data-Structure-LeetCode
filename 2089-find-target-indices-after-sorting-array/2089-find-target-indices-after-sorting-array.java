class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int[] prefixSum = new int[101];
        
        for(int i : nums) {
            prefixSum[i]++;
        }
        for(int i = 1 ; i <= target ; i++) {
            prefixSum[i] += prefixSum[i-1];
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = prefixSum[target-1]  ; i < prefixSum[target] ; i++) {
            ans.add(i);
        }
        
        return ans;
        
    }
}