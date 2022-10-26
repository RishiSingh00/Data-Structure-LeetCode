class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        String newStr = "";
        int len = 0;
        
        for(int i = 0; i<s.length();i++) {
            int ascii = s.charAt(i);  
            
            if((ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57)) {
                newStr+=s.charAt(i);
                len++;
            }
        }
        
        
        int end = len-1;
        
        for(int i=0;i<(int) len/2;i++) {
            if(newStr.charAt(i)!=newStr.charAt(end-i)) {
                return false;
            }
        }
        
        return true;
    }
}