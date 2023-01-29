class Solution {
    public int trap(int[] arr) {
        int s = 0, e = arr.length-1;
        int i = 0, j = arr.length-1;
        
        int ans = 0 ;
        
        while(i < j) {
            if(arr[i]<arr[j]) {
                if(arr[i]>=arr[s]){
                    s=i;}
                else{
                    ans += arr[s] - arr[i];}
                i++;
            }
            else {
                if(arr[j]>=arr[e]){
                    e=j;}
                else{
                    ans += arr[e] - arr[j];}
                j--;
            }
        }
        return ans;
        
    }
}

