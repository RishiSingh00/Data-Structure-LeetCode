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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0, sum = 0 ;
        ListNode result = null, ptr1 = l1, ptr2 = l2, resultptr = null;
        
        while(ptr1 != null && ptr2 != null) {
            sum = ptr1.val + ptr2.val + carry;
            carry = sum / 10;
            if(result == null){
                result = new ListNode(sum % 10);
                resultptr = result;}
            else  {
                resultptr.next = new ListNode(sum % 10);
                resultptr = resultptr.next;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        while(ptr1 != null) {
            sum = ptr1.val + carry;
            carry = sum / 10;
            resultptr.next = new ListNode(sum % 10);
            resultptr = resultptr.next;
            ptr1 = ptr1.next;
        }
        
        while(ptr2 != null) {
            sum = ptr2.val + carry;
            carry = sum / 10;
            resultptr.next = new ListNode(sum % 10);
            resultptr = resultptr.next;
            ptr2 = ptr2.next;
        }
        if(carry != 0)
            resultptr.next = new ListNode(carry);
        return result;
    }
}