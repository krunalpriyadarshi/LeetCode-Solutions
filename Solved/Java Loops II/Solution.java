import java.util.*;

class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        try{
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                
                StringBuilder result= new StringBuilder();
                int sum = a + b;
                int mul = 1;
                result.append(sum).append(' ');
                for(int x = 2; x <= n; x++){
                    mul *= 2;
                    sum += (mul * b);
                    result.append(sum).append(' ');
                }   
                System.out.println(result.toString().trim());         
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter integers.");
        }
        finally{
            in.close();
        }
    }
}