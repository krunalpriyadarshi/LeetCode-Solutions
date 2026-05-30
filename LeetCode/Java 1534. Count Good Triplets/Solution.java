class Solution {
    /**
        Returns the count of valid triplet which satisfy the condition of the `Count Good Triplet`. (link to the doc)
        Time Complexity: O(n^3)
        Space Complexity: O(1)
     */    
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0, len = arr.length;

        // Iterate over all the elements of the triplet:
        for(int i = 0; i < len - 2; i++){
            for(int j = i + 1; j < len - 1; j++){
                if(Math.abs(arr[i] - arr[j]) > a)
                    continue;   // Early exist if pair of i and j is invalid.
                for(int k = j + 1; k < len; k++){
                    if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[k] - arr[i]) <= c)
                        count++;    // Increament count if triplet of (i, j, k) is valid.
                }
            }
        }
        return count;
    }
}