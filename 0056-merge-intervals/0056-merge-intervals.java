import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        int idx = 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<Integer> innerArr = new ArrayList<Integer>();
        innerArr.add(intervals[0][0]);
        innerArr.add(intervals[0][1]);
        ans.add(innerArr);
        
        for(int i = 1 ; i < intervals.length ; i++) {
            if(intervals[i][0] <= ans.get(idx).get(1)) {
                if(intervals[i][1]>ans.get(idx).get(1))
                    ans.get(idx).add(1,intervals[i][1]);
            }
                
                
            else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                ans.add(temp);
                idx++;
            }
        }
        
        int[][] result = new int[ans.size()][2];
        for(int i = 0 ; i < ans.size() ; i++) {
            System.out.println(ans.get(i).get(0)+" and "+ans.get(i).get(1));
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }
        return result;
        
    }
}