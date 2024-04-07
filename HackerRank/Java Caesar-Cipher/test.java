import java.util.*;

class test {
    public static String caesarCipher(String s, int k) {
            StringBuilder encrypted = new StringBuilder();
            char base, encryptedChar;
                
            for(char c: s.toCharArray()){
                if(Character.isLetter(c)){
                    base = (Character.isLowerCase(c))? 'a': 'A';  
                    encryptedChar = (char)(((c- base+ k)% 26)+ base);
                    encrypted.append(encryptedChar);
                }   
                else{
                    encrypted.append(c);
                }  
            }
            return encrypted.toString();
        }
    
    public static void main(String args[]) {
        System.out.println(caesarCipher("abcdefghijklmnopqrstuvwxyz", 2));
    }
}