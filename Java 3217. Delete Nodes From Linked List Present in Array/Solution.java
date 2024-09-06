class Solution {
    // Check if the target element exists in the sorted array using binary search
    public boolean isElementExist(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        // Assuming nums is already sorted. If not, sort it outside this method
        Arrays.sort(nums);

        // Create a dummy node to handle edge cases for head deletion
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            // If the element exists in nums, remove it from the list
            if (isElementExist(nums, curr.val)) {
                prev.next = curr.next;
            } else {
                // Move the prev pointer only when not deleting
                prev = curr;
            }
            // Move the curr pointer in both cases
            curr = curr.next;
        }

        return dummy.next; // Return the new head (which might be different)
    }
}
