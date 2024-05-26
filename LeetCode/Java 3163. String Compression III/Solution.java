// 3163. String Compression III

// to pointers I and J will be used. both will start from same index if they are same then we increase J by 1.
// keep doing till condition is false;
// here 3 conditions: 
//      j should be less than length to avoid array out of bound.
//      i and j do not hold same character 
//      number of character reach higher than 9 count
// we will add freq+ char to result string.
class Solution {
  public String compressedString(String word) {
      StringBuilder result= new StringBuilder();
      int i= 0;

      while(i< word.length()){
          int j= i;
          while(j< word.length() && word.charAt(i)== word.charAt(j) && j- i+ 1<= 9)
              j++;

          result.append(j- i).append(word.charAt(i));
          
          i= j;
      }

      return result.toString();
  }

  public static void main(String[] args) {
      Solution s= new Solution();
      
      assert s.compressedString("abcde")== "1a1b1c1d1e": "testcase 1 failed";
      assert s.compressedString("aaaaaaaaaaaaaaaaaaa")== "9a9a1a": "testcase 2 failed"; 

      System.out.println("All testcases pass");
  }
}