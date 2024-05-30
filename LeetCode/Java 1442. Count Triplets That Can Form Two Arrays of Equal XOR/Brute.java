// 1442. Count Triplets That Can Form Two Arrays of Equal XOR

// one loop to get i:
// 2nd loop to get j: which is >i
// 3rd loop to get value from (i, j-1) and value from (j, arr.len- 1).

// TC: O(n^ 3)
class Solution {
    public int countTriplets(int[] arr) {
        int result= 0;

        for(int i= 0; i< arr.length; i++){
            for(int j= i+ 1; j< arr.length; j++){
                int xor_a= 0, xor_b= 0;

                for(int k= i; k< j; k++){
                    xor_a^= arr[k];
                }
                for(int k= j; k< arr.length; k++){
                    xor_b^= arr[k];
                    if(xor_a== xor_b)
                        result++;
                }
            }
        }

        return result++;
    }
}