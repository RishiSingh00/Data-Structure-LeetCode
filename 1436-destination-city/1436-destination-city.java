class Solution {
    public String destCity(List<List<String>> paths) {
        
        HashSet<String> hsh = new HashSet<>();
        for(List<String> ls : paths) {
            hsh.add(ls.get(1));
        }
        for(List<String> ls : paths) {
            hsh.remove(ls.get(0));
        }
        
        
        String result = "";
        for(String s : hsh)
            result = s;
        return result;
    }
}