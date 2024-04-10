// 830. Positions of Large Groups

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<List<Integer>> largeGroupPositions(String s) {
      List< List<Integer> > result= new ArrayList<>();

      int startInterval= 0, count= 1;
      for(int i= 1; i<= s.length(); i++){
          if(i== s.length() || s.charAt(i-1) != s.charAt(i)){                
              if(count> 2){
                  result.add(new ArrayList<> (Arrays.asList(startInterval, i- 1)));
              }
              if (i < s.length()) {
                  startInterval = i;
                  count = 1;
              }
          }
          else{
              count++;
          }
      }

      return result;
  }

  public static void main(String[] args){
      Solution obj= new Solution();
      System.out.println(obj.largeGroupPositions("abcdddeeeeaabbbcd"));
  }
}