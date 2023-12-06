import java.util.Scanner;

class InvalidEntryException extends Exception{
    public InvalidEntryException(){
        super("java.lang.Exception: Breadth and height must be positive");
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            byte B= sc.nextByte();
            byte H= sc.nextByte();
            if(B> 0 && H> 0){
                System.out.println(B*H);
            }
            else{
                throw new InvalidEntryException();
            }
        }
        catch(InvalidEntryException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}