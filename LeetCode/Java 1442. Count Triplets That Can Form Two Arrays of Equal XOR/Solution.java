// 1442. Count Triplets That Can Form Two Arrays of Equal XOR

// find a group that can has xor value of 0.
// after that we can count number of xor group (i, j, k) that can be form.
class Solution {
  public int countTriplets(int[] arr) {
      int result= 0;

      for(int i= 0; i< arr.length; i++){
          int xor= arr[i];
          for(int k= i+ 1; k< arr.length; k++){
              xor^= arr[k];

              if(xor== 0){
                  result+= k- i;
              }
          }
      }

      return result;
  }
}