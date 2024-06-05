class Solution {
  public List<String> commonChars(String[] words) {
      int[] freqs= new int[26];

      for(char ch: words[0].toCharArray()){
          freqs[ch- 'a']++;
      }

      for(int i= 1; i< words.length; i++){
          int[] count= new int[26];

          for(char ch: words[i].toCharArray()){
              count[ch- 'a']++;
          }

          for(int j= 0; j< 26; j++){
              freqs[j]= Math.min(freqs[j], count[j]);
          }
      }

      List<String> result= new ArrayList<>();

      for(int i= 0; i< 26; i++){
          while(freqs[i]> 0){
              result.add( String.valueOf((char) (i+ 'a')));
              freqs[i]--;
          }
      }
      return result;
  }
}