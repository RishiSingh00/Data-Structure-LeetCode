class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //won't be contained to a range 
        int[] res = Arrays.copyOf(nums,nums.length);
        HashMap<Integer,Integer> hs = new HashMap<>();
        Arrays.sort(res);
        
        for(int i = 0 ; i < nums.length ; i++) {
            hs.putIfAbsent(res[i],i);
        }
        
        for(int i = 0 ; i < nums.length ; i++) {
            res[i] = hs.get(nums[i]);
        }
        return res;
    }
}