class Solution {
    public String destCity(List<List<String>> paths) {
        
        HashSet<String> sHsh = new HashSet<>();
        HashSet<String> eHsh = new HashSet<>();
        for(List<String> ls : paths) {
            if(eHsh.contains(ls.get(0)))
                eHsh.remove(ls.get(0));
            else
                sHsh.add(ls.get(0));
            if(sHsh.contains(ls.get(1)))
                sHsh.remove(ls.get(1));
            else
                eHsh.add(ls.get(1));
        }
        
        String result = "";
        for(String s : eHsh)
            result = s;
        return result;
    }
}