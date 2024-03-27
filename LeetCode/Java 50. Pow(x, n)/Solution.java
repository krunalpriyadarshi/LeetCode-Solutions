// 50. Pow(x, n)
// URL: https://leetcode.com/problems/powx-n/

/*
 * integer-wraparound:
      When Overflow or Underflow occurs Java internal will wrap the integer range.
      ex., 
        char c= -128 
        c-=1;
        Which will be -129 but it is out of char range.
        So wrap-around will put 127 instead of giving error.

        Same thing for.,
        Char c= 127;
        c+=1;
        output: c: -128 because of wrap-around concept.        

        This concept does not apply to floating data type because of significant bits.

    Overflow:   Integer.MAX_VALUE + 1   --> result value is too big to fit in Integer data type cause Overflow.
    Underflow:  Integer.MIN_VALUE - 1   --> result value is too small to fit in Integer data type cause Undeflow.
 */

class Solution {
    public double myPow(double x, int n) {
        double result = 1;
        // minimum int will overflow when multiplied by -1
        // ex., char c= -128; c* -1= 127; but char range is -128 to 127 so it will
        // overflow and give -128.
        long num = (n < 0) ? (long) n * -1 : n;

        while (num > 0) {
            if (num % 2 == 0) {
                x *= x;
                num /= 2;
            } else {
                result *= x;
                num--;
            }
        }

        return (n < 0) ? (1.0 / result) : result;
    }
}