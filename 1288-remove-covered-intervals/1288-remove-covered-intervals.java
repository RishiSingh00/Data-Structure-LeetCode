import java.util.*;
class Solution {
   
    static void sort(int[][] arr, int colNum) {
        Arrays.sort(arr, new Comparator<int[]>() {
            
            @Override
            public int compare(int[] val1,int[] val2) {
                if(val1[colNum] > val2[colNum])
                    return 1;
                else 
                    return -1;
            }
        });
    }
    public int removeCoveredIntervals(int[][] intervals) {
        
        if(intervals.length == 1)
            return 1;
        
        sort(intervals,0);
        
        
        int i = 0 , j = 1;
        
        int count = 0;
        while(j < intervals.length){
            System.out.println("i: "+i+" j: "+j);
            if(intervals[i][0] <= intervals[j][0] && intervals[i][1]>=intervals[j][1]) {
                count++;
                
            }
            else {
                i = j;
            }
            j++;
        }
       
        return intervals.length-count;
    }
}