class Solution {
  public String removeStars(String s) {
      Stack<Character> st = new Stack<>();

      for(char ch : s.toCharArray()){
          if(ch != '*')
              st.push(ch);
          else{
              if(st.isEmpty())
                  continue;
              
              st.pop();
          }
      }

      StringBuilder sb = new StringBuilder();
      
      while(!st.isEmpty()){
          sb.insert(0, st.pop());
      }

      return sb.toString();
  }
}