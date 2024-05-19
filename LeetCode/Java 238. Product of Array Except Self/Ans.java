
public class Ans {
    public static void main(String[] args) {
        int[] arr= { 1, 2, 3, 4};

        int product= 1;

        for(int i: arr){
            product*= i;
        }

        // INVALID AS question says not to use division operator:
        int[] result= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i]= product/ arr[i];
        }

        for(int i: result){
            System.out.print(i + " ");
        }
    }
}
