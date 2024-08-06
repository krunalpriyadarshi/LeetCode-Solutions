import java.util.Hashtable;

class Solution { 
 
  public static void main(String[] args) {
      Hashtable<String, Integer> map= new Hashtable<>();

      map.put("abc", 2);
      map.put("xyz", 3);
      map.put("pqr", 4);
      map.put("abc", 5);

      for(String key: map.keySet()){
        System.out.println(key);
      }
  }
}
