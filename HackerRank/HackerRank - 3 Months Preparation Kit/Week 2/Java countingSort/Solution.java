import java.util.Arrays;
import java.util.List;

class Solution { 
  public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        Integer[] result= new Integer[100];
        Arrays.fill(result, 0);
        
        for(int val: arr){
            result[val]++;
        }
        
        return Arrays.asList(result);
    }
}
