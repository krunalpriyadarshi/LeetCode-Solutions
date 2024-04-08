// Find the factorial of a number using a lambda expression:
@FunctionalInterface
interface find{
  int factorial(int n);
}

class Solution { 
  public static void main(String[] args) {
      find obj= (int num) -> {
          int factorial= 1;
          for(int i= 1; i<= num; i++){
            factorial*= i;  
          }
          return factorial;
      };

      System.out.println(obj.factorial(5));
  }
}
