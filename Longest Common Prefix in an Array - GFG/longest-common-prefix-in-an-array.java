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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        int min = Integer.MAX_VALUE;
        for(String i : arr){
            min = Math.min(min,i.length());
        }
        String ans = "";
        
        for(int i = 0 ; i < min ; i++ ) {
            for(int j = 0 ; j < arr.length ; j++) {
                if(arr[j].charAt(i) != arr[0].charAt(i)){
                    if(ans=="")
                        return "-1";
                    return ans;
                }
            }
            ans = ans + arr[0].charAt(i);
        }
        return ans;
    }
}