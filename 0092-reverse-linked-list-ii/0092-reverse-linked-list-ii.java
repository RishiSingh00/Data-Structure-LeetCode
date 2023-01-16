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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode lPrev = null , rNext = head.next , l = head, r = head, headCopy = head, prev = null;
        int counter = 1;
        while(counter <= right) {
            if(counter == left) {
                lPrev = prev;
                l = headCopy;
            }
            if(counter == right) {
                rNext = headCopy.next;
                r = headCopy;
            }
            counter++;
            prev = headCopy;
            headCopy = headCopy.next;
        }
        
        prev = null;
        ListNode curr = l;
        while (curr != rNext)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        if(lPrev != null)
            lPrev.next = r;
        else
            head = r;
        if(rNext != null)
            l.next = rNext;
        
        return head;
        
    }
}