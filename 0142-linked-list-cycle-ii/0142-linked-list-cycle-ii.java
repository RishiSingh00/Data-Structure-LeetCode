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
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;
        
        if(head == null)
            return null;       
        
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                while(fast != entry) {
                    fast = fast.next;
                    entry = entry.next;
                }
                return entry;
            }
            
            
        }
        return null;
    }
}