// Checks if a string is empty or not using lambda expression
import java.util.ArrayList;

@FunctionalInterface
interface check{
  boolean isEmpty(String str);
}

class Solution { 
  public static void main(String[] args) {
      check obj= (String s) -> {
        return s.isEmpty();
      };

      System.out.println(obj.isEmpty("Hello"));
      System.out.println(obj.isEmpty(""));

      // Let's test it with an ArrayList:
      ArrayList<String> list = new ArrayList<String>();
      list.add("Hello");
      list.add("");
      list.add("World");
      list.add("");

      for(String s: list){
        System.out.println(obj.isEmpty(s));
      }
  }
}
