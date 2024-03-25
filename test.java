import java.util.Hashtable;

public class test {
    public static void main(String[] args) {
        int n= 3;
        int k= 2;
        
        int r= n/ 3;
        System.out.println("r: "+r);
        System.out.println((int)Math.pow(k, n-r));
        System.out.println((int)Math.pow(k-1, r));

        System.out.println((int)Math.pow(k, n-r)* (int)Math.pow(k-1, r));

        
    }
}
