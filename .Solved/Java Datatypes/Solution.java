import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < x; i++) {
            try {
                long n = scan.nextLong();
                // using setLength(0) to reset the StringBuilder or creating a new one in each iteration.
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