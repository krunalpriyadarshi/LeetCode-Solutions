class Solution {
    public StringBuilder compressedStringelper(int freq, char ch){
        StringBuilder helper= new StringBuilder();
        while(freq> 9){
            helper.append(9).append(ch);
            freq-= 9;
        }
        
        helper.append(freq).append(ch);    

        return helper;       
    }

    public String compressedString(String word) {
        StringBuilder comp= new StringBuilder();
        int freq= 1;
        
        for(int i= 1; i< word.length(); i++){
            if(word.charAt(i)== word.charAt(i- 1)){
                freq++;
            }
            else{
                comp.append(compressedStringelper(freq, word.charAt(i- 1)));                
                freq= 1;
            }
        }
        comp.append(compressedStringelper(freq, word.charAt(word.length()- 1)));  
        
        return comp.toString();
    }
}