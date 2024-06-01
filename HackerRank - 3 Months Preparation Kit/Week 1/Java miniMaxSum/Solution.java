import java.util.List;
import java.util.ArrayList;

// TC: O(n)
class Solution { 
  public static void miniMaxSum(List<Integer> arr) {
    long min= Integer.MAX_VALUE, max= Integer.MIN_VALUE, sum= 0;
    
    for(int i: arr){
        sum+=i;
        if(min> i)
            min= i;
        if(max< i)
            max= i;
    }
    
    System.out.println((sum- max)+" "+ (sum- min));
}
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    arr.add(5);
    miniMaxSum(arr);
  }
}
