import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i : nums)
            hs.add(i);
        int maxCount = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            
            if(!hs.contains(nums[i]-1)) {
                int count = 1;
                int curr = nums[i];
                while(hs.contains(curr+1)) {
                    count++;
                    curr++;
                }
                maxCount = Math.max(count,maxCount);
                
            }
            
        }
        
        return maxCount;
    }
}