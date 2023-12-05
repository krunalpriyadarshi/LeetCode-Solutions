import java.util.Scanner;

/* There are basically two alternatives, using setLength(0) to reset the StringBuilder or creating a new one in each iteration. Both can have pros and cons depending on the usage.
If you know the expected capacity of the StringBuilder beforehand, creating a new one each time should be just as fast as setting a new length. It will also help the garbage collector, since each StringBuilder will be relatively short-lived and the gc is optimized for that.
When you don't know the capacity, reusing the same StringBuilder might be faster. Each time you exceed the capacity when appending, a new backing array has to be allocated and the previous content has to be copied. By reusing the same StringBuilder, it will reach the needed capacity after some iterations and there won't be any copying thereafter.*/

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < x; i++) {
            try {
                long n = scan.nextLong();
                str.setLength(0);
                
                if (n >= -128 && n <= 127) {
                    str.append("\n* byte");
                }
                if (n >= -32768 && n <= 32767) {
                    str.append("\n* short");
                }
                if (n >= -2147483648 && n <= 2147483647) {
                    str.append("\n* int");
                }
                if (n >= -9223372036854775808L && n <= 9223372036854775807L) {
                    str.append("\n* long");
                }

                System.out.println(n + " can be fitted in:" + str);
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
        scan.close();
    }
}