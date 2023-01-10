//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] price = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                price[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            sln.stockBuySell(price, n);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public void stockBuySell(int[] prices, int n) {
        // code here
        int s = -1;
        boolean flag = true;
        
        
        for(int i = 0 ; i < n ; i++) {
            
            if(s == -1)
                s = i;
                
            else if( prices[i] < prices[i-1] ) {
                if(i-1 != s) {
                    flag = false;
                    System.out.print("("+s+" "+(i-1)+")"+" ");
                }
                s = i;
            }
        }
        
        if(s != n-1){
            System.out.print("("+s+" "+(n-1)+")"+" ");
            flag = false;}
        if(flag)
            System.out.print("No Profit");
        System.out.print("\n");
    }
}