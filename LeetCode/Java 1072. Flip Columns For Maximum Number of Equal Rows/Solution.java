import java.util.HashMap;
import java.util.Map;

class Solution { 
    public int maxEqualRowsAfterFlips(int[][] matrix){
        // HashMap to store Key: String representation of the row, Value: Count of the matching row
        Map<String, Integer> map = new HashMap<>();

        for(int[] row: matrix){
            StringBuilder sb = new StringBuilder();
            // If the first element of the row is 1, then flip the row
            if(row[0] == 1){
                for(int i = 0; i < row.length; i++){
                    sb.append(row[i] == 1 ? 0 : 1);
                }
            } else {
                for(int i = 0; i < row.length; i++){
                    sb.append(row[i]);
                }
            }
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
        }

        // Find the maximum count of the matching rows
        int max = 0;
        for(int val: map.values()){
            max = Math.max(max, val);
        }

        return max;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] matrix = {{0,1},{1,1}};
        assert sol.maxEqualRowsAfterFlips(matrix) == 1: "Test Case 1 Failed";

        matrix = new int[][] {{0, 0, 0}, {0, 0, 1}, {1, 1, 0}};
        assert sol.maxEqualRowsAfterFlips(matrix) == 2: "Test Case 2 Failed";

        matrix = new int[][] {{0, 1}, {1, 0}};
        assert sol.maxEqualRowsAfterFlips(matrix) == 2: "Test Case 3 Failed";

        System.out.println("All test cases passed!");
    }
}
