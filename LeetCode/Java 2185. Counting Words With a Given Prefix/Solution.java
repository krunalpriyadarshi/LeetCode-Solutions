// 2185. Counting Words With a Given Prefix

/*
 * Returns number of strings from words[] if string starts with pref
 * 
 * @Params words[]: array of strings
 * @Params pref: prefix to check
 * @return: number of strings from words[] if string starts with pref
 */

class Solution {
  public int prefixCount(String[] words, String pref) {
      int result = 0;
      for(String word : words){
          if(word.startsWith(pref))
              result++;
      }

      return result;
  }
}