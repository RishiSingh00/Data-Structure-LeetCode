/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int lenA=0,lenB=0;
        
        ListNode Ahead = headA, Bhead = headB;
        while(Ahead!=null) {
            lenA++;
            Ahead = Ahead.next;
        }
        while(Bhead!=null) {
            lenB++;
            Bhead = Bhead.next;
        }
        Ahead = headA;
        Bhead = headB;
        
        if(lenA>lenB) {
            for(int i=1;i<=lenA-lenB;i++) {
                Ahead = Ahead.next;
            }
        }
        else {
            for(int i=1;i<=lenB-lenA;i++) {
                Bhead = Bhead.next;
            }
        }
        
        while(Ahead!=null && Ahead!=Bhead) {
            Ahead=Ahead.next;
            Bhead=Bhead.next;
        }
        
        if(Ahead == Bhead)
            return Ahead;
        else
            return null;
    }
}