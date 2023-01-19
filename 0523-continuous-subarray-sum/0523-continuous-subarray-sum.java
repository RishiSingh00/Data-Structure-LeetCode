class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> hsh = new HashMap<Integer, Integer>();
        int sum = 0;
        hsh.put(0,0);
        for(int i = 0 ; i < nums.length ; i++) {
            sum += nums[i];
            int key = sum % k;
            System.out.println(sum + "sum and key " + key + " and i "+i);
            if(hsh.containsKey(key)){
                if(i + 1 - hsh.get(key) > 1)
                    return true;}
            else
                hsh.put(key,i+1);
            
        }
        return false;
    }
}