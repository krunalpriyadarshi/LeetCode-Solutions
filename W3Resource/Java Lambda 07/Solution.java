// Remove all elements from a list that appear more than once:
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

@FunctionalInterface
interface find{
  List<Integer> remove(List<Integer> arr);
}

class Solution { 
  public static void main(String[] args) {
      find obj= (List<Integer> arr)->{
        Hashtable<Integer, Integer> ht= new Hashtable<>();
        for(int i: arr){
          if(ht.containsKey(i)){
            ht.put(i, ht.get(i)+1);
          }
          else{
            ht.put(i, 1);
          }
        }
        List<Integer> result= new ArrayList<>();
        for(int i: arr){
          if(ht.get(i)==1){
            result.add(i);
          }
        }
        return result;
      };

      // Let's test it with an ArrayList: 
      List<Integer> arr= new ArrayList<>();
      arr.add(1);
      arr.add(2);
      arr.add(3);
      arr.add(4);
      arr.add(5);
      arr.add(1);

      System.out.println(obj.remove(arr));
  }
}
