import java.util.List;

class Solution { 
  public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    List<Integer> firstDElements = arr.subList(0, d);
    arr = arr.subList(d, arr.size());
    arr.addAll(firstDElements);
    return arr;
}
}
