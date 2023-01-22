class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        
         List<List<Integer>> outer = new ArrayList<List<Integer>>();
        outer.add(new ArrayList<Integer>());
        Arrays.sort(arr);
        for(int num : arr) {
            
            int n = outer.size();
            for(int i = 0 ; i < n ; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                if(!outer.contains(inner))
                    outer.add(inner);
            }
        }
        return outer;
    }
}