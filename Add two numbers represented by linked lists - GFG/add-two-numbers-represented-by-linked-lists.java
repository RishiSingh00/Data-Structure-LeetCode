//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    
    static Node reverse(Node root) {
        Node prev = null, curr = root;
        
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
    
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Node tempF = reverse(first), tempS = reverse(second),ansHead = null, tempAns = ansHead;
        int carry = 0;
        
        while(tempF!=null && tempS != null){
            int q = (tempF.data+tempS.data+carry)%10;
                Node temp = new Node(q);
                temp.next = tempAns;
                tempAns = temp;
            
            carry = (tempF.data+tempS.data+carry)/10;
            tempF = tempF.next; tempS = tempS.next;
        }
        while(tempF!=null){
            int q = (tempF.data+carry)%10;
                Node temp = new Node(q);
                temp.next = tempAns;
                tempAns = temp;
            carry = (tempF.data+carry)/10;
            tempF= tempF.next;
        }
        while(tempS!=null){
            int q = (tempS.data+carry)%10;
                Node temp = new Node(q);
                temp.next = tempAns;
                tempAns = temp;
            carry = (tempS.data+carry)/10;
            tempS= tempS.next;
        }
        if(carry!=0) {
            Node temp = new Node(carry);
            temp.next = tempAns;
            tempAns = temp;
        }
        return tempAns;
        
        
        
    }
}