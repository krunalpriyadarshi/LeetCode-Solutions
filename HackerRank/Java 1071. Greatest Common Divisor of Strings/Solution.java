class Solution {
  // Find the greatest common divisor of two numbers:
  int gcd(int a, int b){
      if(b == 0)
          return a;
       
       return gcd(b, a% b);
  }

  // Check if the string can be divided by the prefix:
  boolean isDivided(String s, String prefix){
      for(int i = 0; i< s.length(); i += prefix.length()){
          if(!prefix.equals(s.substring(i, i+ prefix.length())))
              return false;
      }

      return true;
  }

  // Find the greatest common divisor of two strings:
  public String gcdOfStrings(String str1, String str2) {
      int len = gcd(str1.length(), str2.length());
      String prefix = str1.substring(0, len);
      return (isDivided(str1, prefix) && isDivided(str2, prefix))? prefix: "";
  }
}