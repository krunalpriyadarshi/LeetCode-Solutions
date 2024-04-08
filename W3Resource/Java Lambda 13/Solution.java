// find the number of words in a string using lambda expression:
@FunctionalInterface
interface find{
  int findCount(String sentence);
}

class Solution { 
  public static void main(String[] args) {
      find obj= (String sentence) -> {
        return sentence.trim().split(" ").length;
      };

      System.out.println(obj.findCount("Hi, I am Krunal!"));
  }
}
