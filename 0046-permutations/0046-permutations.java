class Solution {
    static List<List<Integer>> permutation(int[] nums,int[] p,int[] up) {
        List<List<Integer>> lst = new ArrayList<List<Integer>>();
        
        if(up.length == 0) {
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i : p) {
                ans.add(i);
            }
            lst.add(ans);
            return lst;
        }
        
        int[] newUp = newUpArr(up);
        
        for(int i = 0 ; i < p.length+1 ; i++) {
            int[] temp = new int[p.length+1];
            rotateInsert(p,temp,i,up[0]);
            lst.addAll(permutation(nums,temp,newUp));
        }
        return lst;
    }
    static int[] newUpArr(int[] nums) {
        int arr[] = new int[nums.length-1];
        for(int i = 1; i < nums.length ; i++) {
            arr[i-1] = nums[i];
        }
        return arr;
    }
    
    static void rotateInsert(int[] p, int[] newArr, int idx, int val) {
        int i = 0, j = 0;
        while( i < newArr.length) {
            if(i == idx)
                newArr[i] = val;
            else {
                newArr[i] = p[j];
                j++;
            }
            i++;
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        return permutation(nums,new int[0], nums);
    }
}