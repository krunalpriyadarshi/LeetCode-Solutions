import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {
    
    public static String splitCamelCaseHelper(String s){
        StringBuilder result= new StringBuilder();
        
        for(int i= 0; i< s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                result.append(' ').append(Character.toLowerCase(s.charAt(i)));
            }
            else{
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }
    
    public static String combineCamelCaseHelper(String s){
        StringBuilder result= new StringBuilder();
        
        for(int i= 0; i< s.length(); i++){
            if(s.charAt(i)== ' '){
                result.append( Character.toUpperCase(s.charAt(++i)) );
            }
            else{
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }

    public static String camelCase(String s){
        String[] data= s.split(";");
        
        if(data[0].equals("S")){
            // Split function:
            
            if(data[1].equals("M"))
                // if we're performing split on Method:
                // removing last 2 character from data[2] because we do not need while processing:
                return splitCamelCaseHelper(data[2].substring(0, data[2].length()- 2));
            else if(data[1].equals("C"))
                // if we're performing split on Class:
                // convert first character to lowercase and use helper method to get desired string:
                return Character.toLowerCase(data[2].charAt(0))+ splitCamelCaseHelper(data[2].substring(1));
            else
                return splitCamelCaseHelper(data[2]);
        }
        else{
            // Combine function:
            if(data[1].equals("C")){
                return Character.toUpperCase(data[2].charAt(0))+ combineCamelCaseHelper(data[2].substring(1));
            }
            else if(data[1].equals("V")){
                return combineCamelCaseHelper(data[2]);
            }
            else{
                return combineCamelCaseHelper(data[2])+ "()";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        while(sc.hasNext()){
            System.out.println(camelCase(sc.nextLine()));
        }
        
        sc.close();
    }
}
