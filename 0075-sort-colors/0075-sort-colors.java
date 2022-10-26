class Solution {
    public void sortColors(int[] nums) {
        
        int i=-1;
        
        for(int x = 0;x<nums.length;x++) {
            if(nums[x]==0) {
                i++;
                if(x!=i){
                nums[x]+=nums[i];
                nums[i]=nums[x]-nums[i];
                nums[x]-=nums[i];}
            }
        }
        
        for(int x = i+1;x<nums.length;x++) {
            if(nums[x]==1) {

                i++;
                if(x!=i){
                nums[x]+=nums[i];
                nums[i]=nums[x]-nums[i];
                nums[x]-=nums[i];}
            }
        }
    }
}