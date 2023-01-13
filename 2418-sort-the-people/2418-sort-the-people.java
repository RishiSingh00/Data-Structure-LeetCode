class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        HashMap<Integer,Integer> hs = new HashMap<>();
        
        for(int i = 0 ; i < heights.length ; i++) {
            hs.put(heights[i],i);
        }
        Arrays.sort(heights);
        String[] ans = new String[names.length];
        
        int idx = heights.length-1;
        for(int i : heights)
            ans[idx--] = names[hs.get(i)];
        
        return ans;
    }
}