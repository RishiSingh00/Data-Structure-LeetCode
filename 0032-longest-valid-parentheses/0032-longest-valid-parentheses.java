class Solution {
    public int longestValidParentheses(String s) {
     
        Stack<Character> stk = new Stack<>();
        Stack<Integer> countStk = new Stack<>();
        countStk.push(0);
        
        for(int i = 0 ; i < s.length() ; i++) {
            if(stk.empty() && s.charAt(i) == ')')
                countStk.push(0);
            
            else if(s.charAt(i) == '(') {
                stk.push('(');
                countStk.push(1);
            }
            
            else {
                while(countStk.peek() % 2 == 0) {
                    countStk.push(countStk.pop()+countStk.pop());
                }
                stk.pop();
                countStk.push(countStk.pop()+1);
            }
        }
        
        int count = 0;
        int max = 0;
        
        while(!countStk.empty()) {
            if(countStk.peek() <= 1) {
                max = max > count ? max : count;
                count = 0;
                
            }
            else {
                count += countStk.peek();
            }
            countStk.pop();
        }
        return max;
    }
}