// 1694. Reformat Phone Number:

class Solution {
  public String reformatNumber(String number) {
      // removing ' ' and '-':
      number= number.replaceAll("[- ]", "");

      StringBuilder sb= new StringBuilder();
      int i= 0, count= number.length();
      while(count> 4){
          sb.append( number.substring(i, i+3) );
          sb.append( "-" );
          i+= 3;
          count-=3;
      }

      if( count!= 4 ){
          sb.append( number.substring( number.length()- count, number.length() ) );
      }
      else{
          sb.append( number.substring( number.length()- 4, number.length()- 2 ) );
          sb.append( "-" );
          sb.append( number.substring( number.length()- 2, number.length() ) );
      }

      return sb.toString();
  }
}