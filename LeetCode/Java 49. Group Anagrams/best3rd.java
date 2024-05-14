import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String, List<String>> hash= new Hashtable<>();

        for(String s: strs){
            char[] arr= s.toCharArray();
            Arrays.sort(arr);
            String key= new String(arr);

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