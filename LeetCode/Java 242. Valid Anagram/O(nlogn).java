// 242. Valid Anagram
// URL: https://leetcode.com/problems/valid-anagram/description/

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;

        char[] arr_s= s.toCharArray();
        char[] arr_t= t.toCharArray();

        Arrays.sort(arr_s);
        Arrays.sort(arr_t);

        for(int i= 0; i< s.length(); i++){
            if(arr_s[i]!= arr_t[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram")); // true
        System.out.println(solution.isAnagram("rat", "car")); // false
    }
}