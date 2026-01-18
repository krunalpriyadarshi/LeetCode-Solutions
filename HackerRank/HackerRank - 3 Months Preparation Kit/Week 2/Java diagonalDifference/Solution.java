import java.util.ArrayList;
import java.util.List;

class Solution { 
  public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int i= 0, j= arr.size()- 1;
        int leftDiagonalSum= 0, rightDiagonalSum= 0;
        
        for(List<Integer> ar: arr){
            leftDiagonalSum+= ar.get(i++);
            rightDiagonalSum+= ar.get(j--);
        }
        
        return (int) Math.abs(leftDiagonalSum- rightDiagonalSum);
    }
}
