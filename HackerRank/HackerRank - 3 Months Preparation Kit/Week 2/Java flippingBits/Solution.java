class Solution { 

  public static long flippingBits(long n) {
    // Write your code here
    
        return n ^ 0xFFFFFFFFL;

    }

  public static void main(String[] args) {
      
    
    assert flippingBits(2147483647)== 1: "test case failed";

    System.out.println("All test cases passed");
  }
}
