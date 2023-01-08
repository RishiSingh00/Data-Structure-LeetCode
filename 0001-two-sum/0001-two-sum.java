import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        Hashtable<Integer,Integer> hs = new Hashtable<>();
        
        for(int i = 0; i < nums.length ; i++) {
            if(hs.containsKey(target-nums[i])) {
                result[0] = i;
                result[1] = hs.get(target-nums[i]);
            }
            else
                hs.put(nums[i], i);
        }
        
        return result;
    }
}