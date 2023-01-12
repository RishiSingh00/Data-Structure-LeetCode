import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0 ;
        int sum = 0;
        HashMap<Integer, Integer> hashOfOccurance = new HashMap<>();
        
        hashOfOccurance.put(sum, 1);  //initially we have sum = 0
        
        for(int i = 0 ; i < nums.length ; i++) {
            sum += nums[i];
            if(hashOfOccurance.containsKey(sum - k)) {
                count += hashOfOccurance.get(sum - k);
            }
            hashOfOccurance.put(sum, hashOfOccurance.getOrDefault(sum,0) + 1);
        }
        return count;
    }
}