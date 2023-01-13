class Solution {
    public int minimumSum(int num) {
        
        int[] arr = new int[4];
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = num % 10 ;
            num /= 10;
        }
        Arrays.sort(arr);
        
        return (arr[0]+arr[1])*10+arr[2]+arr[3];
    }
}