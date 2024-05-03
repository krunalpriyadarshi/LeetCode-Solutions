// 1598. Crawler Log Folder
// URL: https://leetcode.com/problems/crawler-log-folder/

class Solution {
  public int minOperations(String[] logs) {
      int depth= 0;
      for(String log: logs){
          if(log.equals("../")){
              // if not in main directory:
              if(depth!= 0)
                  depth--;
          }
          else if(log.equals("./")){
              continue;
          }
          // case like: x/
          else{
              depth++;
          }
      }
      return depth;
  }

  public static void main(String[] args) {
      Solution s= new Solution();
      String[] logs= {"d1/","d2/","../","d21/","./"};
      System.out.println(s.minOperations(logs));
  }
}