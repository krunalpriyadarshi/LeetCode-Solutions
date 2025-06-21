class Solution {
    /**
        Calculates frequency of each character of given string

        @param  string Input string    
        @return int[] Array integer representing frequency count of each character
     */
    public static int[] calculateFrequency(String word){
        int[] freq = new int[26];   // Optimized HashMap, frequency array where index 1 = 'a', 2 = 'b'
        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }

        return freq;
    }

    /**
        Check if give strings are close or not.
        A string is close if other string can be created by performing 2 operations:
            Operation1 : swap any 2 characters
            Operation2 : Transform every occurence of character to eisting other character. Do vise-versa.

        Time Complexity :   O(n)
        Space Complexity:   O(n)

        @param  String word1, word2 Input strings to check if they are close or not.
        @return boolean returns true if close string else false
     */
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;   // Length mismatch indicates Strings are not conversable.

        // Check if same character set exist for both strings:
        int[] freq1 = calculateFrequency(word1);    // HashMap of character over frequency of its occurence in word1
        int[] freq2 = calculateFrequency(word2);    // HashMap of character over frequency of its occurence in word2

        for(int i = 0; i < 26; i++){
            boolean b1 = (freq1[i] == 0);
            boolean b2 = (freq2[i] == 0);

            if(b1 != b2)
                return false;   // when a char exists in one string but not in other
        }

        // Match frequency occurence in both hashmaps:
        HashMap<Integer, Integer> frequencyCountMap = new HashMap<>();
        for(int key : freq1){
            frequencyCountMap.put(key, frequencyCountMap.getOrDefault(key, 0) + 1); // calculating occurence of each frequency
        }

        // Checks same occurence exist for other string:
        for(int key : freq2){
            if(!frequencyCountMap.containsKey(key))
                return false;   // occurence of frequency mismatch 
            
            int val = frequencyCountMap.get(key) - 1; // reduce one occurence during travaseral
            if(val == 0)
                frequencyCountMap.remove(key);    // remove key if occurence reached to 0
            else
                frequencyCountMap.put(key, val);  // update occurence of each key frequency
        }

        return true;    // Valid close strings
    }
}