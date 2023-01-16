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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return null;
        
        ListNode prev = null, slowHead = head, fastHead = head;
        
        while(fastHead != null) {
            fastHead = fastHead.next;
            if(fastHead != null) {
                prev = slowHead;
                slowHead = slowHead.next;
                fastHead = fastHead.next;
            }
        }
        
        if(prev == null)
            return head.next;
        
        prev.next = slowHead.next;
        return head;
    }
}