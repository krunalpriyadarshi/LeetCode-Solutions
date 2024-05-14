// 49. Group Anagrams
// O(n* m) where n is number of strings and m being avg. length of strings:

import java.util.HashMap;
import java.util.List;    
import java.util.ArrayList;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();

        for (String s : strs) {
            // O(n) TC to create a key:
            int[] freq = new int[26];
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (freq[i] != 0) {
                    sb.append((char) 'a' + i);
                    sb.append(freq[i]);
                }
            }
            String key = sb.toString();
            
            hash.computeIfAbsent(key, k -> new ArrayList<String>()).add(s);
        }

        return new ArrayList<>(hash.values());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})); // [["bat"],["nat","tan"],["ate","eat","tea"]]
    }
}