// 1640. Check Array Formation Through Concatenation
// URL: https://leetcode.com/problems/check-array-formation-through-concatenation/

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for (int[] piece : pieces) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == piece[0]) {
                    for (int val : piece) {
                        if (i>= arr.length || arr[i] != val)
                            return false;
                            arr[i]= -1;
                        i++;
                    }
                }
            }
        }

        int sum= 0;
        for(int i: arr){
            sum+= i;
        }
        return sum== (-1* arr.length) ? true: false;
    }
}