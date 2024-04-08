// to filter even numbers from a list of integers using Lambda.
@FunctionalInterface
interface filter{
  boolean isEven(int a);
}

class Solution { 
  public static void main(String[] args) {
     filter obj= (int num) -> num% 2== 0;

      System.out.println(obj.isEven(10));
      System.out.println(obj.isEven(15));
      // Let's test it with an array:
      int[] arr= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

      for(int i: arr){
        if(obj.isEven(i)){
          System.out.println("even: "+ i);
        }
        else{
          System.out.println("Not even: " + i);
        }
      }
  }
}
