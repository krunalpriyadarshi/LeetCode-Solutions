import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String min = "zzz", max = "AAA", sS;
        for (int i = 0; i < (s.length() - k + 1); i++) {
            sS = s.substring(i, i + k);
            if(min.compareTo(sS) > 0){
                min= sS;
            }
            if(max.compareTo(sS) < 0){
                max= sS;
            }
        }
        return min + "\n" + max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getSmallestAndLargest(sc.nextLine(), sc.nextInt()));
        sc.close();
    }
}