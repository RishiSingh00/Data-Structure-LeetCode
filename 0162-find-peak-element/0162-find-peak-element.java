class Solution {
    
    static int findPeak(int[] arr, int s, int e) {
        int mid = s + (e - s) / 2;
        if(s > e) {
            return -1;
        }
        if(mid == 0) {
            if(arr[mid]>arr[mid+1])
                return mid;
        }
        else if(mid == arr.length -1) {
            if(arr[mid] > arr[mid-1] )
                return mid;
        }
        else if(arr[mid]>arr[mid-1] && arr[mid]> arr[mid+1]) {
            return mid;
        }
        
        int num = findPeak(arr,s,mid-1);
        if(num != -1)
            return num;
        num = findPeak(arr,mid+1,e);
        return num;
    }
    public int findPeakElement(int[] nums) {
        if(nums.length == 1)
            return 0;
        return findPeak(nums,0,nums.length-1);   
    }
}