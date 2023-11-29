import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum= b;
            int mul= 1;
            System.out.print(a+sum+" ");
            for(int x=2; x<=n; x++){
                mul*=2;
                sum+=(mul*b);
                System.out.print(a+sum+" ");
            }   
            System.out.println("");         
        }
        in.close();
    }
}
