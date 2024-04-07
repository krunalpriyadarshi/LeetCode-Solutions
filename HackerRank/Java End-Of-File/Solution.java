import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        int n= 0;
        Scanner sc= new Scanner(System.in);
        try{
            String s= sc.nextLine();
            // isEmpty() method is safe to use even if the string is null. It returns true if the string is empty or null.
            while(!s.isEmpty()){
                System.out.println(++n + " " + s);
                s= sc.nextLine();
            }
        }
        catch(Exception e){
            // NoSuchElementException, IllegalStateException, InputMismatchException might occurs.
            e.printStackTrace();
        }
        finally{
            // Close the Scanner to release system resources. 
            // Gives warning if Scanner is not closed "Resource leak: 'sc' is never closed".
            sc.close();
        }
    }
}
