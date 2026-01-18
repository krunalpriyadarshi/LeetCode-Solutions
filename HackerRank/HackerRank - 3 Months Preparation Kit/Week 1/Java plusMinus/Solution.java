import java.util.Arrays;
import java.util.List;

// TC: O(n)
// String.format() is being used to get desired number of decimal places.

class Solution {
  public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float positive = 0.0f, negative = 0.0f, nutral = 0.0f;
    for (int i : arr) {
      if (i > 0)
        positive++;
      else if (i < 0)
        negative++;
      else
        nutral++;
    }

    System.out.println(String.format("%.6f", (positive / arr.size())));
    System.out.println(String.format("%.6f", (negative / arr.size())));
    System.out.println(String.format("%.6f", (nutral / arr.size())));
  }

  public static void main(String[] args) {
    List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
    plusMinus(arr);
  }
}
