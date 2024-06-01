class Solution {
  public static String pangrams(String s) {
    boolean isPangrams = false;
    int[] alphabets = new int[26];
    int countOfUniqueAlpha = 26, index;

    for (char ch : s.toCharArray()) {
      if (ch == ' ')
        continue;
      else if (Character.isUpperCase(ch))
        ch = Character.toLowerCase(ch);

      index = ch - 'a';
      if (alphabets[index] == 0)
        countOfUniqueAlpha--;

      if (countOfUniqueAlpha == 0) {
        isPangrams = true;
        break;
      }

      alphabets[index]++;
    }

    return (isPangrams) ? "pangram" : "not pangram";
  }
}
