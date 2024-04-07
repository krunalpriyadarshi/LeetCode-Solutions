import java.util.*;

class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. STRING n
     * 2. INTEGER k
     */

     public static int superDigit(String n, int k) {
        
        int temp = findSum(n) * k;
        
        if(temp>9){
            temp = findSum(String.valueOf(temp));
        }

        return temp;
    }
    
    static int findSum(String num){
        if(num.length() == 1){
            return Integer.parseInt(num);
        }
        
        int sum =0;
        for(int i=0; i<num.length(); i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        
        return findSum(String.valueOf(sum));
    }

}

class test {
    public static void main(String args[]) {
        System.out.println("");
        System.out.println("");

        Result r = new Result();

        System.out.println(r.superDigit("123", 3));

        System.out.println("");
        System.out.println("");
    }
}
