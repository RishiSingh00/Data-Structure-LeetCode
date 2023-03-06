//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int startX(int[] arr,int n,int x) {
        int s = 0, e = n-1;
        
        while(s <= e) {
            int m = s + ( e - s ) / 2;
            if(arr[m] == x && ( m==0 || arr[m] != arr[m-1]))
                return m;
            if(arr[m] >= x)
                e = m - 1;
            else
                s = m + 1;
        }
        return -1;
    }
    
    int endX(int[] arr,int n,int x) {
        int s = 0, e = n-1;
        
        while(s <= e) {
            int m = s + ( e - s ) / 2;
            if(arr[m] == x && ( m==n-1 || arr[m] != arr[m+1]))
                return m;
            if(arr[m] > x)
                e = m - 1;
            else
                s = m + 1;
        }
        return -1;
    }
    int count(int[] arr, int n, int x) {
        // code here
        
        int s = startX(arr,n,x);
        if(s == -1 )
            return 0;
        int e = endX(arr,n,x);
        return e - s + 1;
    }
}