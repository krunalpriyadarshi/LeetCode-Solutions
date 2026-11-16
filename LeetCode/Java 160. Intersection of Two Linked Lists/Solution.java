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
        // If either of given Linked List is empty, return null as there is no possibility of having intersection in such a case:
        if(headA == null || headB == null)
            return null;

        // check for the intersect: 
        // store reference of each node from Linked list A in HashSet:
        Set<ListNode> mapOfReferences = new HashSet<>();
        ListNode curr = headA;

        // traverse linked list A
        do {
            mapOfReferences.add(curr);
            curr = curr.next;
        }
        while(curr != null);

        // traverse linked list B, and check if curr node's reference is present in hashset:
        curr = headB;
        do{
            // if reference is present in the hashSet, return that node reference:
	        if(mapOfReferences.contains(curr))
                return curr;

            curr = curr.next;
        }
        while(curr != null);

        // no intersaction point found hence return null value:
        return null;
    }
}