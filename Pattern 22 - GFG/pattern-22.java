//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
        // code here
        
        for(int i=0 ; i<n ; i++) {
            int num=n;
            for(int j=0 ; j<2*n-1 ; j++) {
                if(j > 0) {
                    if(j <= i)
                        num--;
                }
                if(j>=2*n-i-1)
                    num++;
                    
                System.out.print(num+" ");
            }
            System.out.print("\n");
        }
        for(int i=n-2 ; i>=0 ; i--) {
            int num=n;
            for(int j=0 ; j<2*n-1 ; j++) {
                if(j > 0) {
                    if(j <= i)
                        num--;
                }
                if(j>=2*n-i-1)
                    num++;
                    
                System.out.print(num+" ");
            }
            System.out.print("\n");
        }
    }
}