//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int evenlyDivides(int N){
        
        int newN = N, result = 0;
        
        while(newN>0) {
            if(newN%10 != 0 && N%(newN%10) == 0)
                result++;
            newN =(int) newN/10;
        }
        return result;
    }
}