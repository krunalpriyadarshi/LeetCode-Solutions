// 2399. Check Distances Between Same Letters
// url: https://leetcode.com/problems/check-distances-between-same-letters

class Solution {
  public boolean checkDistances(String s, int[] distance) {
      int[] map= new int[26];
      int index;

      for(int i= 0; i< s.length(); i++){
          index= s.charAt(i)- 'a';
          if(map[index]== 0){
              map[index]= i+ 1;
          }
          else if(i- map[index]!= distance[index]){
              return false;
          }
      }   
      return true;
  }

  public static void main(String[] args) {
    Solution s= new Solution();
    System.out.println(s.checkDistances("abacbc", new int[]{1, 2, 3, 4, 5, 6}));
    
  }
}
