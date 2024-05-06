// 881. Boats to Save People
// URL: https://leetcode.com/problems/boats-to-save-people/

import java.util.Arrays;

class Solution {
  public int numRescueBoats(int[] people, int limit) {
      Arrays.sort(people);

      int i= 0, j= people.length- 1, count= 0;

      while(i<= j){
          if(people[i]+ people[j]<= limit){
              i++;
              j--;
          }
          else if(people[j]<= limit)
              j--;
          else
              i++;
          count++;
      }

      return count;
  }

  public static void main(String[] args) {
      Solution s= new Solution();
      int[] people= {3, 2, 2, 1};
      int limit= 3;
      System.out.println(s.numRescueBoats(people, limit));
  }
}