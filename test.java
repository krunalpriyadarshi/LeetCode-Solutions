import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        // create a array with 5 elements and create a arrayList with all subarrays possibe with recusrion


        
        int[] arr = {10, 5, 2,6};
        Arrays.sort(arr);    
        ArrayList<ArrayList<Integer>> subArrays = new ArrayList<ArrayList<Integer>>();
        double product = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                ArrayList<Integer> subArray = new ArrayList<Integer>();
                product = 1;
                for (int k = i; k <= j; k++) {
                    product *= arr[k];
                    if(product> 100) break;
                    subArray.add(arr[k]);
                }
                subArrays.add(subArray);
            }
        }

        //print all subarrays
        for (ArrayList<Integer> subArray : subArrays) {
            System.out.println(subArray);
        }
    }
}
