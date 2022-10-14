/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        while(head != null && head.val != Integer.MAX_VALUE) {
            head.val= Integer.MAX_VALUE;
            head = head.next;
        }
        
        if(head!=null && head.val==Integer.MAX_VALUE)
                return true;
        else
            return false;
        
    }
}