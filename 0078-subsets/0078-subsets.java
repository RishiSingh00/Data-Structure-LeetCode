class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<List<Integer>>();
        outer.add(new ArrayList<Integer>());

        for(int num : arr) {
            
            int n = outer.size();
            for(int i = 0 ; i < n ; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}