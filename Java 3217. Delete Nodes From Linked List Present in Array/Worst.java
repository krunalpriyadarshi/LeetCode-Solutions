/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Worst {
  public boolean isElementExist(int[] nums, int target) {
      int left = 0, right = nums.length - 1;

      while (left <= right) {
          int mid = left + (right - left) / 2;

          if (nums[mid] == target)
              return true;
          else if (nums[mid] < target)
              left = mid + 1;
          else
              right = mid - 1;
      }

      return false;
  }

  public ListNode modifiedList(int[] nums, ListNode head) {
      Arrays.sort(nums);

      ListNode curr = head, prev = head;

      while (curr != null) {
          if(isElementExist(nums, curr.val)){
              if(curr== head){
                  head= head.next;
                  curr= head;
              }
              else{
                  prev.next= curr.next;
                  curr= curr.next;
              }
          }
          else{
              prev= curr;
              curr= curr.next;
          }
      }

      return head;
  }
}