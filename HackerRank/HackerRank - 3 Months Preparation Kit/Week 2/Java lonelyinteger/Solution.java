import java.util.List;
import java.util.ArrayList;

class Solution {
  public static int lonelyinteger(List<Integer> a) {
    int result = 0;

    for (int i : a) {
      result ^= i;
    }

    return result;

  }

  public static void main(String[] args) {
    // test cases:

    // 1. lonelyinteger([1])
    // expected_output= 1
    List<Integer> a = new ArrayList<>();
    a.add(1);

    System.out.println(lonelyinteger(a));

    // 2. lonelyinteger([1, 1, 2])
    // expected_output= 2
    a = new ArrayList<>();
    a.add(1);
    a.add(1);
    a.add(2);

    System.out.println(lonelyinteger(a));

    // 3. lonelyinteger([0, 0, 1, 2, 1])
    // expected_output= 2
    a = new ArrayList<>();
    a.add(0);
    a.add(0);
    a.add(1);
    a.add(2);
    a.add(1);

    System.out.println(lonelyinteger(a));
  }
}
