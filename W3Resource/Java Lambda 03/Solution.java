// Convert String to LowerCase and UpperCase using lambda expression:
import java.util.ArrayList;

@FunctionalInterface
interface convertLowerCase{
  String convert(String str);
}

@FunctionalInterface
interface convertUpperCase{
  String convert(String str);
}

class Solution { 
  public static void main(String[] args) {
    String s= "heLLo WoRLd";

    convertLowerCase low= (String str) -> str.toLowerCase();
    convertUpperCase up= (String str) -> str.toUpperCase();

    System.out.println(low.convert(s));
    System.out.println(up.convert(s));

    // Let's test it with an ArrayList:
    ArrayList<String> arr= new ArrayList<>();
    arr.add("kruNAL");
    arr.add("KRUNAL");
    arr.add("krunal");

    for(String i: arr){
      System.out.println(low.convert(i) + " " + up.convert(i));
    }
 }
}
