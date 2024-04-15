class Solution {
  public int scoreOfString(String s) {
      int sum= 0;
      for(int i= 0; i< s.length()-1; i++){
          int result= s.charAt(i)- s.charAt(i+1);
          System.out.println(result);
          sum+= (int)(Math.abs(result));
      }
      
      return sum;
  }

  public static void main(String[] args) {
      Solution s= new Solution();
      System.out.println(s.scoreOfString("hello"));
  }
}