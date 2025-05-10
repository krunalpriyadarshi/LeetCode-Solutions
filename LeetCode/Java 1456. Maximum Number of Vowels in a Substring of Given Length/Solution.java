class Solution {
  public int maxVowels(String s, int k) {
      boolean[] vowels = new boolean[26];

      // Marking all vowels true: HashSet
      for(char ch : "aeiou".toCharArray()){
          vowels[ch - 'a'] = true;
      }
      
      // Sliding window:
      int i = 0, j = 0, ans = 0, count = 0;

      while(j < s.length()){
          if(vowels[s.charAt(j) - 'a']){
              count++;
          }
          
          if(j- i+ 1 == k){
              ans = Math.max(ans, count);
              if(vowels[s.charAt(i) - 'a']){
                  count--;
              }
              i++;
          }
          j++;
      }

      return ans;
  }
}