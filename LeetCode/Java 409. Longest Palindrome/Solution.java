// 409. Longest Palindrome

// TC: O(n)
// one loop to count freqs of all character
// one loop to count longestLen: 
// (Odd count of char will be part of string by excluding one character...
// but we'll include highest counted odd freq characters count. so we will just add +1 at the end to make longest string. ex., abbbccccc ==> bcccccb)
class Solution {
  public int longestPalindrome(String s) {
    char[] freqs = new char[52];

    for (char c : s.toCharArray()) {
      if (Character.isUpperCase(c))
        freqs[c - 'A' + 26]++;
      else
        freqs[c - 'a']++;
    }

    int totalLen = 0;
    for (int freq : freqs) {
      if (freq % 2 == 0)
        totalLen += freq;
      else
        totalLen += (freq - 1);
    }

    return (totalLen == s.length()) ? totalLen : ++totalLen;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
        
        // Edge case 1: Empty string
        assert sol.longestPalindrome("") == 0 : "Test Case 1 Failed";

        // Edge case 2: Single character string
        assert sol.longestPalindrome("a") == 0 : "Test Case 2 Failed";

        // Edge case 3: Two different characters
        assert sol.longestPalindrome("ab") == 1 : "Test Case 3 Failed";

        // Edge case 4: All characters the same
        assert sol.longestPalindrome("aaaa") == 4 : "Test Case 4 Failed";

        // Edge case 5: Mix of characters with all even counts
        assert sol.longestPalindrome("aabbcc") == 6 : "Test Case 5 Failed";

        // Edge case 6: Mix of characters with one odd count
        assert sol.longestPalindrome("aabbc") == 5 : "Test Case 6 Failed";

        // Edge case 7: Long string with mixed characters
        assert sol.longestPalindrome("abccccdd") == 7 : "Test Case 7 Failed";

        // Edge case 8: String with multiple odd counts
        assert sol.longestPalindrome("abcabcabc") == 7 : "Test Case 8 Failed";

        // Edge case 9: Large input with repeated pattern
        String largeInput = "a".repeat(1000) + "b".repeat(1000) + "c".repeat(999);
        assert sol.longestPalindrome(largeInput) == 2999 : "Test Case 9 Failed";

        // Edge case 10: Palindrome itself
        assert sol.longestPalindrome("racecar") == 7 : "Test Case 10 Failed";

        System.out.println("All test cases passed!");
  }
}