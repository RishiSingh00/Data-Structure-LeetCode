class Solution {
    public int numIdenticalPairs(int[] nums) {
        //Brute Force approach
        int num = 0;
        HashMap<Integer,Integer> hsh = new HashMap<>();
        
        for(int i =nums.length-1;i>=0;i--) {
            if(hsh.containsKey(nums[i])) {
                num += hsh.get(nums[i]);
                hsh.put(nums[i],hsh.get(nums[i])+1);
                continue;
            }
            hsh.put(nums[i],1);
        }
        return num;
    }
}