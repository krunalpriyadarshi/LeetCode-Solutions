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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        
        do {
            if(head.val == val)
                head = head.next;
            else 
                break;
        } while(head != null);

        if(head == null || head.next == null)
            return head;

        ListNode curr = head;
        ListNode next = head.next;
        do {
            if(next.val == val) {
                // delete next node:
                curr.next = next.next;
                next = next.next;
                continue;
            }
            curr = next;
            next = next.next;
        }
        while(next != null);
        
        return head;
    }
}