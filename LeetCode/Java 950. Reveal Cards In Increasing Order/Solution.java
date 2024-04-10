// 950. Reveal Cards In Increasing Order

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
  public int[] deckRevealedIncreasing(int[] deck) {
      Arrays.sort(deck);

      Deque<Integer> result = new ArrayDeque<>();
      int temp;
      for (int i = deck.length; i > 0; i--) {
          if (result.size() < 2) {
              result.addFirst(deck[i - 1]);
          } else {
              temp = result.removeLast();
              result.addFirst(temp);
              result.addFirst(deck[i - 1]);
          }
      }

      return result.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
      Solution obj = new Solution();
      System.out.println(Arrays.toString(obj.deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7})));
  }
}