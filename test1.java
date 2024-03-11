import java.util.Hashtable;

public class test1 {
   
    public static void main(String[] args) {
       System.out.println("hi");
        String order= "abcd";
        Hashtable<Character, Integer> hash= new Hashtable<Character, Integer>();
    
        for(char ch: order.toCharArray()){
            hash.put(ch, 0);
        }

        hash.put('a', (hash.containsKey('a'))?hash.get('a')+ 1:999);

        System.out.println(hash.toString());

    }
}
