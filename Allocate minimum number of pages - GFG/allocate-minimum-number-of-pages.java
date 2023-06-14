//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    public static boolean isPossible(int[] arr,int n,int m,int pages) {
        int sum = arr[0], std = 1;
        
        for(int i = 1 ; i < n ; i++) {
            if(arr[i] > pages) return false;
            if(sum + arr[i] > pages){
                sum = arr[i];
                std++;
            }
            else
                sum += arr[i];
        }
        if(std <= m) return true;
        else return false;
    }
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(M > N) return -1;
        int s = 1, e = (int)Math.pow(10,6);
        
        while(s < e) {
            int m = s + ( e - s ) / 2;
            
            if(isPossible(A,N,M,m)) e = m;
            else s = m + 1;
        }
        if(isPossible(A,N,M,e)) return e;
        return -1;
    }
};