
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String createHashKey(String s){
      // takes String create new string which has a character and its count like "a1c2d6"
        int[] freq= new int[26];
        for(char ch: s.toCharArray()){
            freq[ch- 'a']++;
        }

        StringBuilder sb= new StringBuilder();
        for(int i= 0; i< 26; i++){
            if(freq[i]!= 0){
                sb.append((char) 'a'+ i);
                sb.append(freq[i]);
            }
        }

        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String, List<String>> hash= new Hashtable<>();

        for(String s: strs){            
            // sorting takes O(nlog(n)) TC but frequency count and creating string will take O(n) TC:
            String key= createHashKey(s);
            List<String> value= new ArrayList<String>();
           
            if(hash.containsKey(key))
                value= hash.get(key);
                
            value.add(s);
            hash.put(key, value);
        }

        List<List<String>> result= new ArrayList<>();

        for(String key: hash.keySet()){
            result.add(hash.get(key));
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})); // [["bat"],["nat","tan"],["ate","eat","tea"]]
    }
}