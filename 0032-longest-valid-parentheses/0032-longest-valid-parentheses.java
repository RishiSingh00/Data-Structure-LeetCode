class Solution {
    public int longestValidParentheses(String s) {
     
        Stack<Character> stk = new Stack<>();
        Stack<Integer> countStk = new Stack<>();
        countStk.push(0);
        
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '(') {
                countStk.push(1);
            }
            else {
                if(countStk.peek()==0)
                    continue;
                else if(countStk.peek() % 2 != 0) {
                    countStk.push(countStk.pop() + 1);
                }
                else {
                        int curr = countStk.pop();
                        int prev = countStk.pop();
                        while(prev %2 == 0 && prev != 0 ) {
                            curr = curr+prev;
                            prev = countStk.pop();
                        }
                        
                        if(prev != 0)
                            countStk.push(curr+prev+1);
                        else {
                            countStk.push(prev);
                            countStk.push(curr);
                            countStk.push(0);
                        }                        
                }
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