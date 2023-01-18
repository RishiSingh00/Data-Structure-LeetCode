class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int counter = 0;
        int var = Integer.MIN_VALUE;
        int maj = nums.length / 2;
        for(int i : nums) {
           
            
            if(var != i ) {     
                var = i;
                counter = 1;
            }
            else {
                counter++;
            }
            if ( counter  > maj )
                    return i;
        }
        
        return nums[nums.length-1];
    }
}