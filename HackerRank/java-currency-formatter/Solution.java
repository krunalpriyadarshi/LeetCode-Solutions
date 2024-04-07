import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){        
        Scanner sc= new Scanner(System.in);
        float payment= sc.nextFloat();
        sc.close();

        NumberFormat nf= NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + nf.format(payment));
        nf= NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        System.out.println("India: " + nf.format(payment));
        nf= NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + nf.format(payment));
        nf= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + nf.format(payment));
    }
}
