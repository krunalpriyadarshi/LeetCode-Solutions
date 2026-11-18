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
        ListNode curr = head;
        ListNode pointer = null, res = null;

        while(curr != null) {
            if(curr.val != val) {
                ListNode temp = new ListNode(curr.val);
                if(res == null) {
                    res = temp;
                    pointer = res;
                }
                else{
                    pointer.next = temp;
                    pointer = pointer.next;
                }
            }
            curr = curr.next;
        }

        return res;
    }
}