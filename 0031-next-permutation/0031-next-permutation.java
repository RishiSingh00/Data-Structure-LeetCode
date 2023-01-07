class Solution {
    void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
        
    public void nextPermutation(int[] nums) {
     
        if(nums.length == 1) return;

        int i = nums.length - 2;

        for( ; i >=0 ; i--) {
            if(nums[i] < nums[i+1]) {
                break;
            }
        }

         // to increase value of i both in case of with swap and without swap( i becomes -1)
        if(i != -1) {
            for(int j = nums.length-1; j > i ; j--) {
                if(nums[j] > nums[i]){
                    swap(nums,i,j);
                    break;
                }
            }
        }
        System.out.println("i ;"+i);
        i++;
        int e = (int)((nums.length - i)/2) ;
        
        System.out.println("e si : "+e);
        
        for(int j = 0 ; j < e ; j++) {
            System.out.println("j : "+j);
            swap(nums, j+i, nums.length - 1 - j);
        }
    }
}