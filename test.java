import java.util.Hashtable;

public class test {
    public static void main(String[] args) {
        // create an ahash table and print it:
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        ht.put("one", 1);
        ht.put("two", 2);
        ht.put("three", 3);

        System.out.println(ht);

    }
}