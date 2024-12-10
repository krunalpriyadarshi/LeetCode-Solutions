import java.util.Arrays;

/*
 * Traverse the array from left to right. And calculate PREFIX SUM.
 * 
 * If parity is different from previous element, increment the count.
 * Else reset count to 1.
 * --> This count defines the number of elements before that element follow the rule.
 * 
 * For each Query, count number of elements.
 * Now based on end index, we can check on "count" array 
 * 
 */

class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] count = new int[nums.length];
        Arrays.fill(count, 1);
        for(int i = 1; i < nums.length; i++){
            if((nums[i] - nums[i-1]) % 2 != 0)
                count[i] = count[i-1] + 1;
        }

        boolean[] result = new boolean[queries.length];
        int index = 0;
        for(int[] query : queries){
            result[index++] = ((count[query[1]] >= (query[1] - query[0] + 1)));
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 3, 4, 5, 5, 5, 6, 7, 6, 6, 7};
        int[][] queries = {{0, 2}, {0, 5}, {0, 9}, {3, 9}, {4, 9}, {5, 9}, {6, 9}, {7, 9}, {8, 9}, {9, 9}};
        boolean[] result = sol.isArraySpecial(nums, queries);
        for(boolean b : result){
            System.out.print(b + " ");
        }
    }
}