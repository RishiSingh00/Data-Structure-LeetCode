class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> hsh = new HashMap<>();
        int sum = 0;
        hsh.put(0,1);
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            sum += nums[i];
            int key = (sum % k);
            if(key < 0)
                key += k;
            ans += hsh.getOrDefault(key, 0);
            hsh.put(key, hsh.getOrDefault(key, 0) + 1);
        }
        return ans;
    }
}