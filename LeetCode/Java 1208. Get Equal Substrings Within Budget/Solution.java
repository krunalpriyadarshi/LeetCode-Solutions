// 1208. Get Equal Substrings Within Budget

class Solution {
  public int equalSubstring(String s, String t, int maxCost) {
      int[] absoluteDiff= new int[s.length()];

      for(int i= 0; i< s.length(); i++){
          absoluteDiff[i]= Math.abs(s.charAt(i)- t.charAt(i));
      }

      int result= 0;
      for(int i= 0; i< absoluteDiff.length; i++){
          int currCost= 0, j= i;
          while(j< absoluteDiff.length){
              currCost+= absoluteDiff[j];
              if(currCost> maxCost)
                  break;
              j++;
          }
          result= Math.max(result, j- i);
      }

      return result;
  }
}