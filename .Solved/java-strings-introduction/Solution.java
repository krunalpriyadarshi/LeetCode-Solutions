import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String A= sc.nextLine();
        String B= sc.nextLine();
        sc.close();

        System.out.println(A.length()+ B.length());
        
        System.out.println(((int)A.charAt(0) > (int)B.charAt(0)) ? "Yes" : "No");

        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1));
    }
}