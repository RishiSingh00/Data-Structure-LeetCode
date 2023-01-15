class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] startArr = new int[intervals.length];
        HashMap<Integer, Integer> startIndexHsh = new HashMap<>();
        
        for( int i = 0 ; i < intervals.length ; i++) {
            startArr[i] = intervals[i][0];
            startIndexHsh.put(intervals[i][0],i);
        }
        Arrays.sort(startArr);
        
        int[] result = new int[intervals.length];
        
        for(int i = 0 ; i < intervals.length ; i++) {
            
                int res = binarySearch(startArr,intervals[i][1]);
                result[i] = res == -1 ? -1 : startIndexHsh.get(startArr[res]);    
            
            
        }       
        
        return result;
        
    }
    
    int binarySearch(int[] arr, int target) {
        int s = 0, e = arr.length-1;
        
        while(s <= e) {
            int m = s + ( e - s ) / 2; 
            System.out.println(m+" "+target);
            if(m == 0 && arr[m] >= target) 
                return m ;
            if(arr[m] >= target && arr[m-1] < target)
                return m ;
            if(arr[m] > target)
                e = m - 1;
            else
                s = m + 1;
        }
        
        return -1;
    }
}