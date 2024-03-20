import java.util.Hashtable;
class Solution {
    public boolean Solw(String s, String t) {
        Hashtable<Character, Character> hash1= new Hashtable<>();
        Hashtable<Character, Character> hash2= new Hashtable<>();
        char key1, value1, key2, value2;
        for(int i= 0; i< s.length(); i++){
            key1= value2= s.charAt(i);
            value1= key2= t.charAt(i);

            if(hash1.containsKey(key1)){
                if(hash1.get(key1)!= value1) return false;
            }
            else{
                hash1.put(key1, value1);
            }

            if(hash2.containsKey(key2)){
                if(hash2.get(key2)!= value2) return false;
            }
            else{
                hash2.put(key2, value2);
            }
        }
        return true;
    }
}