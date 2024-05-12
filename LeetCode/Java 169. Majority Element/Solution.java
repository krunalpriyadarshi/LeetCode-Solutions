// 169. Majority Element

// More Voting Algorithm:
class Solution {
  public int majorityElement(int[] nums) {
    int result = nums[0], count = 1;

    for (int i = 1; i < nums.length; i++) {
      if (result != nums[i]) {
        if (count == 1)
          result = nums[i];
        else
          count--;
      } else
        count++;
    }

    return result;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.majorityElement(new int[] { 3, 2, 3 })); // 3
    System.out.println(solution.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 })); // 2
  }
}