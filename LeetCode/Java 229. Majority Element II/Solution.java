import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> majorityElement(int[] nums) {
      int num1 = Integer.MIN_VALUE, count1 = 0;
      int num2 = Integer.MIN_VALUE, count2 = 0;

      for(int num : nums){
          if(num == num2)
              count2++;
          else if(num == num1)
              count1++;
          else if(count1 == 0){
              num1 = num;
              count1 = 1;
          }
          else if(count2 == 0){
              num2 = num;
              count2 = 1;
          }
          else{
              count1--;
              count2--;
          }
      }

      // System.out.println(num1);
      // System.out.println(num2);
      // System.out.println(count1);
      // System.out.println(count2);

      count1 = 0;
      count2 = 0;

      for(int num : nums){
          if(num == num1)
              count1++;
          else if(num == num2)
              count2++;
      }

      int minCount = nums.length/ 3;

      List<Integer> result= new ArrayList<>();
      if(count1 > minCount)
          result.add(num1);
      if(count2 > minCount)
          result.add(num2);

      return result;
  }
}