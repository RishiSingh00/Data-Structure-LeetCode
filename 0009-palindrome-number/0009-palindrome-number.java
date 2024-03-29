class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0)
            return false;
        
        int reverse = x % 10;
        int xCopy = (int) x / 10; 
        
        while(xCopy > 0 ) {
            reverse = reverse*10 + xCopy % 10;
            xCopy = (int) xCopy / 10;
        }
        
        return reverse == x;
        
        
    }
}