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
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=2*n;j++) {
                if(j<=i || j>2*n-i) 
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        
        for(int i=1;i<n;i++) {
            for(int j=1;j<=2*n;j++) {
                if(j<=n-i || j>n+i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}