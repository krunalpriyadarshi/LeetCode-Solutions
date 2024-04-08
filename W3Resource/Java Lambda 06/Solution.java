// Find the average of the elements of an ArrayList using a lambda expression:
import java.util.ArrayList;

@FunctionalInterface
interface find{
  double average(ArrayList<Double> arr);
}

class Solution { 
  public static void main(String[] args) {
      find obj= (ArrayList<Double> arr) ->  {
        double sum= 0;
        for(double i: arr){
          sum+= i;
        }
        return sum/arr.size();
      };

      // Let's test it with an ArrayList:
      ArrayList<Double> arr= new ArrayList<>();
      arr.add(1.0);
      arr.add(2.0);
      System.out.println(obj.average(arr));
      
  }
}
