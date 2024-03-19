/*
 * Can be solved with logic.
 * 
 * Find a number which has max freq in tasks.
 * So this task will have "(freq-1) *n". 
 *          if we have freq of A: 3 and n=3, then emptyslots are 6. [A, _, _, _, A, _, _, _, A]
 * now all task with freq> 0, can be added to these empty slots.
 *          note: 
 *          if B has same freq as A then only (freq-1) slots can be filled. [A, B, _, _, A, B, _, _, A, B]
 *          and if freq is less than A then only that many can be filled. 
 *              ex., C has 1 freq. => [A, B, C, _, A, B, _, _, A, B]
 *          so, empty slots that can be filled are minium of either (maxFreq -1) or Current task's frequency
 * If is also possible that empty slots can be filled early. so we have to check till we can fill empty slots.
 * 
 * so the minimum length of this will be "total numbers of task + left empty slots"
 */

 import java.util.Arrays;

 class Solution {
     public int leastInterval(char[] tasks, int n) {
         int[] charFreq = new int[26];
         for (char c : tasks) {
             charFreq[c - 'A'] += 1;
         }
 
         Arrays.sort(charFreq);
 
         int emptySlots = (charFreq[25] - 1) * n;
         for (int i = 24; i >= 0; i--) {
             emptySlots -= Math.min(charFreq[i], charFreq[25] - 1);
         }
 
         return emptySlots < 0? tasks.length: tasks.length + emptySlots;
     }
 }