// Concatenate two strings using lambda expression:
@FunctionalInterface
interface find{
  String concat(String s1, String s2);
}

class Solution { 
  public static void main(String[] args) {
      find obj= (String a, String b)-> {
        return a+b;
      };

      System.out.println(obj.concat("Hello", "World"));
      System.out.println(obj.concat("Java", "Programming"));
  }
}
