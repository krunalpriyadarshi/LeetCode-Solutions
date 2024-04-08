// Check if a number is prime or not using lambda expression:
@FunctionalInterface
interface find {
  boolean isPrime(int n);
}

class Solution {
  public static void main(String[] args) {
    find obj= (int num)-> {
      boolean isPrime= true;
      if(num == 1) isPrime = false;

      for(int i= 2; i< num; i++){
        if(num%i ==0) isPrime = false;
      }

      return isPrime;
    };

    System.out.println(obj.isPrime(1));
    System.out.println(obj.isPrime(2));
    System.out.println(obj.isPrime(3));
    System.out.println(obj.isPrime(4));
  }
}
