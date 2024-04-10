//804. Unique Morse Code Words
import java.util.HashSet;
import java.util.Set;

class Solution {
  private static final String[] morseCodeArr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

  public int uniqueMorseRepresentations(String[] words) {
      Set<String> morseCode = new HashSet<>();

      for (String word : words) {
          StringBuilder sb = new StringBuilder();
          for (char ch : word.toCharArray()) {
              sb.append(morseCodeArr[ch - 'a']);
          }
          morseCode.add(sb.toString());
      }

      return morseCode.size();
  }
}