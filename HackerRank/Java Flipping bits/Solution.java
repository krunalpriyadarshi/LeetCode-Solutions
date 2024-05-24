// https://www.hackerrank.com/challenges/three-month-preparation-kit-flipping-bits/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-two
// You will be given a list of 32 bit unsigned integers. Flip all the bits ( and ) and return the result as an unsigned integer.

public class Solution{
  public static long flippingBits(long n) {
    // hexadecimal version of (2^31- 1) or (Math.pow(2, 32)- 1):
    return n ^ 0xFFFFFFFFL;
  }

  public static void main(String[] args) {
    // assertion:
    // Function to flip the bits of a 32-bit unsigned integer
    assert flippingBits(3) == 4294967292L : "Test case 1 failed";
    assert flippingBits(2147483647) == 2147483648L : "Test case 2 failed";
    assert flippingBits(1) == 4294967294L : "Test case 3 failed";
    assert flippingBits(0) == 4294967295L : "Test case 4 failed";

    System.out.println("All test cases passed!");

  }
}