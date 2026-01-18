import java.util.List;
import java.util.ArrayList;

class Solution { 
  public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
        List<Integer> result= new ArrayList<>();
        
        for(String s: queries){
            int countOfMatch= 0;
            for(String pair: strings){
                if(s.equals(pair))
                    countOfMatch++;
            }
            
            result.add(countOfMatch);
        }
        
        return result;
    }
  public static void main(String[] args) {
      // test cases:

      // 1. matchingStrings(["aba", "baba", "aba", "xzxb"], ["aba", "xzxb", "ab"])
      // expected_output= [2, 1, 0]
      List<String> strings= new ArrayList<>();
      strings.add("aba");
      strings.add("baba");
      strings.add("aba");
      strings.add("xzxb");
      
      List<String> queries= new ArrayList<>();
      queries.add("aba");
      queries.add("xzxb");
      queries.add("ab");

      List<Integer> result= matchingStrings(strings, queries);

      for(int i: result)
          System.out.print(i+" ");

  }
}
