//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t  =Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);
            
            int arr1[] = new int[N];
            int arr2[] = new int[M];
            
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
              arr1[i] = Integer.parseInt(st[i]);
            
            st = read.readLine().trim().split(" ");  
            for(int i = 0; i< M; i++)
              arr2[i] = Integer.parseInt(st[i]);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.findUnion(arr1, arr2, N, M);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println(); 
        }
    }
}



// } Driver Code Ends


//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        if(arr2.length > arr1.length) {
            int[] temp = arr2;
            arr2 = arr1;
            arr1 = temp;
        }
        // add your code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int counter = -1,i = 0, j = 0 ;
        while(i < arr1.length && j < arr2.length ) {
            int temp = 0;
            if(arr1[i] < arr2[j] ){
                temp = arr1[i];
                i++;
            }
            else if(arr1[i] == arr2[j]){
                temp = arr1[i];
                i++;
                j++;
            }
            else{
                temp = arr2[j];
                j++;
            }
            if(counter == -1 || ans.get(counter)!=temp){
                ans.add(temp);
                counter++;
            }
        }
        
        for( ; i < arr1.length ; i++) {
            if(counter == -1 || ans.get(counter)!=arr1[i]){
                ans.add(arr1[i]);
                counter++;
            }
        }
        for(;j<arr2.length ; j++){
            if(ans.get(counter)!=arr2[j]){
                ans.add(arr2[j]);
                counter++;
            }
        }
        return ans;
    }
}



