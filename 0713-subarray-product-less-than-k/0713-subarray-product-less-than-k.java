class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int i = 0, j = 0, result = 0;
        int Product = 1;
        boolean flag = true;
        while(i <= j && j <=nums.length-1 ) {
            if(flag)
                Product *= nums[j];
            
            if(Product >= k){
                Product /= nums[i];
                if(i == j){
                    flag = true;
                    j++;}
                else
                    flag = false;
                i++;
                
                continue;
            }
            else    
                result += j - i + 1;
            j++;
            System.out.println(i+" "+j+" "+Product);
            flag = true;
        }
        return result;
    }
}