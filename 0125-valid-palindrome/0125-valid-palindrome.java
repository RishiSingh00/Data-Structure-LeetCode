class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        
        int start = 0, end = s.length()-1;
        
        while(start<end)  {
            int asciiS = s.charAt(start); 
            int asciiE = s.charAt(end);  
            
            if((asciiS<97 || asciiS>122) && (asciiS<48 || asciiS>57)) {
                start++;
                continue;
            }
            if((asciiE<97 || asciiE>122) && (asciiE<48 || asciiE>57)) {
                end--;
                continue;
            }
            if(asciiS!=asciiE) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}