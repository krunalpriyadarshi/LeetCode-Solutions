// Sum of 2 integers using lambda expression:
import java.util.ArrayList;

@FunctionalInterface
interface sumOfIntegers{
  int sum(int a, int b);
}

class Solution { 
  public static void main(String[] args) {
    sumOfIntegers obj= (int x, int y) -> x+ y;

    System.out.println(obj.sum(10, 20));
    System.out.println(obj.sum(20, 20));
    System.out.println(obj.sum(20, 50));

    // Let's test it with an ArrayList:
    ArrayList<int[]> arr = new ArrayList<>();
    arr.add(new int[]{10, 20});
    arr.add(new int[]{20, 20});
    arr.add(new int[]{20, 50});

    for(int[] i: arr){
      System.out.println(": "+ obj.sum(i[0], i[1]));
    }
  }
}
