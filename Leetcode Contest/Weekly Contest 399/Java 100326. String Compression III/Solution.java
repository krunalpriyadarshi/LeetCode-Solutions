class Solution {
  public String compressedString(String word) {
      StringBuilder comp= new StringBuilder();
      word+= "$";
      int freq= 1;
      
      for(int i= 1; i< word.length(); i++){
          if(word.charAt(i)== word.charAt(i- 1)){
              freq++;
          }
          else{
              if(freq> 9){
                  int repeat= freq/ 9;
                  while(repeat--> 0)
                      comp.append(9).append(word.charAt(i- 1));
                  
                  int remaining= freq% 9;
                  if(remaining> 0)
                      comp.append(remaining).append(word.charAt(i- 1));
              }
              else{
                  comp.append(freq).append(word.charAt(i- 1));
              }
              
              freq= 1;
          }
      }
      
      return comp.toString();
  }
}