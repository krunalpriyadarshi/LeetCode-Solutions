// 1941. Check if All Characters Have Equal Number of Occurrences
// URL: https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/


// EDGE CASE: "aaaa" --> return True;
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq= new int[26];
        for(char c: s.toCharArray()){
            ++freq[c- 'a'];
        }
        int count= 0;
        for(int i= 0; i< 26; ++i){
            if(freq[i]!= 0){
                if(count== 0){
                    count= freq[i];
                }
                else if(count!= freq[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "abacbc";
        System.out.println(s.areOccurrencesEqual(str));
    }
}