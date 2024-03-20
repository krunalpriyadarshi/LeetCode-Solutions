import java.util.Hashtable;

class test{
    public static void main(String[] args) {
        String s= "egg", t= "add";

        Hashtable<Character, Character> hash= new Hashtable<>();
        char key, value;
        for(int i= 0; i< s.length(); i++){
            key= s.charAt(i);
            value= t.charAt(i);

            if(hash.containsKey(key)){
                if(hash.get(key)!= value) break;
            }
            else{
                hash.put(key, value);
            }
        }
    }
}