class Solution {
    public boolean isHappy(int n) {
        
        HashMap<Integer,Integer> hsh = new HashMap<>();
        
        while(!hsh.containsKey(n)) {
            int sum = 0;
            hsh.put(n,1);
            while(n!=0) {
                sum+=Math.pow(n%10,2);
                n=n/10;
            }
            n=sum;
            if(n==1)
                return true;
        }
        return false;
    }
}