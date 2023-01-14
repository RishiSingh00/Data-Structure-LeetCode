class Solution {
    public String longestCommonPrefix(String[] strs) {
     
        int ans = 0 ;
        boolean flag = true;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < strs.length ; i++) {
            min = min < strs[i].length() ? min : strs[i].length();
        }
        
        if(min == 0)
            return "";
        
        if(strs.length == 1)
            return strs[0];
        int i = 0;
        for(i = 0 ; i < min ; i++) {
            char chr = strs[0].charAt(i);
            for(String s : strs) {
                
                if(s.charAt(i) != chr)
                    return strs[0].substring(0,i);
            }
            
        }
        return strs[0].substring(0,i);
    }
}