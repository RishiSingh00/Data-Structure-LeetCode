import java.util.*;
class Solution {

    int[] arr;
    public Solution(int[] nums) {
        arr = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            arr[i]=nums[i];
        }
    }
    
    public int[] reset() {
        return arr;
    }
    
    public int[] shuffle() {
        int[] shft = new int[arr.length];
        
        int i;
        
        for(i=0;i<arr.length;i++) {
            shft[i]=Integer.MIN_VALUE;
        }
        
        for(i=0;i<arr.length;) {
            Random ran = new Random();
            int x = ran.nextInt(arr.length);
            if(shft[x]==Integer.MIN_VALUE) {
                shft[x]=arr[i];
                i++;
            }
        }
        return shft;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */