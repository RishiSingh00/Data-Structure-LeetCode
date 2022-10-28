import java.util.*;
import java.lang.*;
class Solution {
    public String decodeString(String s) {
        
        Stack<String> stk = new Stack<>();
        String ans = "",tempStr="";
        
        for(int i=0;i<s.length();i++) {
            
            if(stk.empty() && Character.isAlphabetic(s.charAt(i)))
                ans+=s.charAt(i);
            
            else if(s.charAt(i)==']') {
                tempStr = "";
                
                while(!stk.peek().equals("[")) {
                    tempStr=stk.pop()+tempStr;  
                }
                stk.pop();   //to pop '['
                
                int decimal=0,k=0;
                while(!stk.empty() && Character.isDigit(stk.peek().charAt(0))) {
                    int val=Integer.parseInt(String.valueOf(stk.pop()));
                    if(val!=0) {
                        k+=Math.pow(10,decimal)*val;
                    }
                    decimal++;
                }
                
                tempStr = tempStr.repeat(k);
                if(stk.empty()) {
                    ans+=tempStr;
                }
                else {
                    stk.push(tempStr);
                }
            }
            else {
                
                stk.push(String.valueOf(s.charAt(i)));
            }
            
        }
        
        return ans;
    }
}