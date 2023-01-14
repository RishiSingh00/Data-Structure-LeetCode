class Solution {
    public String longestCommonPrefix(String[] strs) {
     
        int ans = 0 ;
        boolean flag = true;
        
        while(flag) {
            if(strs[0].length() == 0)
                return "";
            int chr = strs[0].charAt(ans);
            for(String s : strs) {
                if(s.length() == 0 || s.charAt(ans) != chr)
                    return strs[0].substring(0,ans);
                if(ans == s.length() - 1)
                    flag = false;
            }
            ans++;
        }
        return strs[0].substring(0,ans);
    }
}