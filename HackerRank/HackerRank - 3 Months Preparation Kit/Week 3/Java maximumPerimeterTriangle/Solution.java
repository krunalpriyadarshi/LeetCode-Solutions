import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
  public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
    // Write your code here
    List<Integer> output = new ArrayList<>();

    Collections.sort(sticks);
    Collections.reverse(sticks);

    for (int i = 0; i < sticks.size() - 2; i++) {
      int longest = sticks.get(i);
      int middle = sticks.get(i + 1);
      int shortest = sticks.get(i + 2);

      if (shortest + middle > longest) {

        output.add(shortest);
        output.add(middle);
        output.add(longest);

        return output;
      }

    }
    output.add(-1);
    return output;

  }
}
