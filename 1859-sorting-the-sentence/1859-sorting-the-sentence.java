class Solution {
    public String sortSentence(String s) {
        
        String[] cpy = s.split(" ");
        String[] res = new String[cpy.length];
        int[] idx = new int[cpy.length];
        
        for(int i = 0 ; i < cpy.length ; i++) {
            idx[i] = cpy[i].charAt(cpy[i].length()-1) - 49;
        }
        
        for(int i = 0 ; i < idx.length ; i++) {
            res[idx[i]] = cpy[i].substring(0,cpy[i].length()-1);
        }
        
        return String.join(" ",res);
        
    }
}