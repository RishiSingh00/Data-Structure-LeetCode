class Solution {
    public String sortSentence(String s) {
        
        String[] ans = s.split(" ");
        
        int i = 0 ; 
        
        while(i < ans.length) {
            int cIndex = ans[i].charAt(ans[i].length() - 1) - 49;
            while(cIndex != i) {
                System.out.println(ans[i]+" "+ans[cIndex]);
                String temp = ans[i];
                ans[i] = ans[cIndex];
                ans[cIndex] = temp;
                cIndex = ans[i].charAt(ans[i].length() - 1) - 49;
            }
            ans[i] = ans[i].substring(0,ans[i].length()-1);
            i++;
        }
        
        return String.join(" ",ans);
        
    }
}