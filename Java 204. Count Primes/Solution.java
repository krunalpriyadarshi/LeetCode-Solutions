// Sieve of Eratosthenes: 
class Solution {
  public int countPrimes(int n) {
      boolean primes[]= new boolean[n];

      for(int i= 2; i* i< n; i++){
          if(!primes[i]){
              for(int j= i* i; j< n; j+= i){
                  primes[j]= true;
              }
          }
      }

      int result= 0;
      for(int i= 2; i< n; i++){
          if(!primes[i])
              result++;
      }

      return result;
  }
}