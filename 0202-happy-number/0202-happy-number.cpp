class Solution {
public:
    bool isHappy(int n) {
        unordered_set <int> hsh;
        
        while(hsh.find(n) == hsh.end()) {
            double sum = 0;
            hsh.insert(n);
            while(n!=0) {
                sum+=pow(n%10,2);
                n=n/10;
            }
            n=sum;
            if(n==1)
                return true;
        }
        return false;
    }
};