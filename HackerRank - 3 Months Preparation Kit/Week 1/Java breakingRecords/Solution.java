import java.util.ArrayList;
import java.util.List;

class Solution { 
  public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        int max= scores.get(0), min= scores.get(0);
        int countOfMax= 0, countOfMin= 0;
        List<Integer> result= new ArrayList<>();
        
        for(int score: scores){
            if(score< min){
                countOfMin++;
                min= score;
            }
            
            if(score> max){
                countOfMax++;
                max= score;
            }
        }
        
        result.add(countOfMax);
        result.add(countOfMin);
        
        return result;
    }
  public static void main(String[] args) {
      System.out.println("Hey! Krunal.");
      System.out.println("Let's Do Today's Leetcode." + "https://leetcode.com/problemset/");
  }
}
