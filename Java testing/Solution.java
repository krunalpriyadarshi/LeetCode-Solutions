import java.util.HashMap;

class Solution { 
  public static void main(String[] args) {
    HashMap<Integer, Integer> hash= new HashMap<>();
    int[] nums1 = {1, 2, 3, 4, 4,4,4,4,4};
    for(int num: nums1){
        hash.put(num, hash.getOrDefault(num, 0)+ 1);
    }

    // print hash table:
    for (int key : hash.keySet()) {
      System.out.println(key + " " + hash.get(key));
    }
  }
}
