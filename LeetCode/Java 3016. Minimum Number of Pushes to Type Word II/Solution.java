// 3016. Minimum Number of Pushes to Type Word II
import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int[] freqs= new int[26];
        for(char c: word.toCharArray()){
            freqs[c- 'a']++;
        }

        Arrays.sort(freqs);

        int countOfPush= 0;
        for(int i= 0; i < 26; i++){
            if(freqs[26- i- 1]== 0)
                break;
            countOfPush+= freqs[26- i- 1]* (i/8+ 1);
        }

        return countOfPush;
    }

    public static void main(String[] args) {
      Solution sol= new Solution();

      // test case 1:
      String word= "leet";
      assert sol.minimumPushes(word)== 4: "Test case 1 failed";

      // test case 2:
      word= "code";
      assert sol.minimumPushes(word)== 14: "Test case 2 will fail because answer is 4";

    }
}