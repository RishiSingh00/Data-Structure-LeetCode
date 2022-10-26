/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
class Solution {
    public int getDecimalValue(ListNode head) {
        
        int len = -1;
        int sum = 0;
        ListNode temp = head;
        
        while(temp!=null) {
            len++;
            temp=temp.next;
        }
        temp = head;
        while(temp!=null) {
            if(temp.val!=0)
                sum+=Math.pow(2,len);
            len--;
            temp = temp.next;
        }
        return sum;
    }
}