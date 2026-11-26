public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode reverse = null;

        while(fast!= null && fast.next!= null) {
            ListNode temp = slow;
            slow = slow.next;
            fast = fast.next.next;

            temp.next = reverse;
            reverse = temp;
        }

        if(fast!= null) slow = slow.next;

        while(slow != null && slow.val == reverse.val) {
            slow = slow.next;
            reverse = reverse.next;
        }

        return slow == null;
    }
}