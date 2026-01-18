import java.util.Arrays;
import java.util.List;

class Solution { 
  public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
        int result= 0;
        
        for(int i= 0; i< n; i++){
            for(int j= i+ 1; j< n; j++){
                if( (ar.get(i)+ ar.get(j))%k ==0 )
                    result++;
            }
        }

        return result;
    }

  public static void main(String[] args) {
    assert divisibleSumPairs(6, 5, Arrays.asList(1, 3, 2, 6, 1, 2)) == 2 : "test case 1 failed";
    assert divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)) == 5 : "test case 2 failed";


      System.out.println("Passed all test cases");
  }
}
