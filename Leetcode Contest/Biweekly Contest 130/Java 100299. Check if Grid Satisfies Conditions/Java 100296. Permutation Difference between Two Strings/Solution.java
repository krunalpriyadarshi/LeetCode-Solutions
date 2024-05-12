class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] occ = new int[26];
        for (int i = 1; i <= s.length(); i++) {
            occ[s.charAt(i - 1) - 'a'] += i;
            occ[t.charAt(i - 1) - 'a'] -= i;
        }

        double result = 0;
        for (int i : occ) {
            result += Math.abs(i);
        }

        return (int) result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findPermutationDifference("abc", "bac"));
    }
}