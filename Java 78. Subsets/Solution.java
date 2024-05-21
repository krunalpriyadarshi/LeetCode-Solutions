import java.util.List;
import java.util.ArrayList;

// Using Bruteforce approach:
// TC: O(2^n -1)
class Solution {
  public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> result= new ArrayList<>();
      result.add(new ArrayList<>());

      for(int num: nums){
          List<List<Integer>> sets= new ArrayList<>();
          for(List<Integer> set: result){
              List<Integer> temp= new ArrayList<>(set);
              temp.add(num);
              sets.add(temp);
          }
          result.addAll(sets);
      }

      return result;
  }

  public static void main(String[] args) {
    Solution solution= new Solution();
    int[] nums= {1, 2, 3};
    List<List<Integer>> result= solution.subsets(nums);
    System.out.println(result);
  }
}