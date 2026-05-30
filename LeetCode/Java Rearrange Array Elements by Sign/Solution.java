
import java.util.Arrays;

class Solution {
    private static int[] rearrangeArray(int[] arr){
        int[] ans = new int[arr.length];

        int i = 0, j = 1;
        for(int val : arr){
            if(val > 0){
                ans[i] = val;
                i += 2;
            }
            else{
                ans[j] = val;
                j += 2;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        if(!Arrays.equals(new int[] {1, -4, 2, -5}, rearrangeArray(new int[] {1, 2, -4, -5})))
            System.out.println("Tast case 1 failed.");

        if(!Arrays.equals(new int[] {1, -3, 2, -1, 3, -2}, rearrangeArray(new int[] {1, 2, -3, -1, -2, 3})))
            System.out.println("Tast case 2 failed.");

        if(!Arrays.equals(new int[] {1, -3, 2, -1, 3, -2}, rearrangeArray(new int[] {1, 2, 3, -3, -1, -2})))
            System.out.println("Tast case 3 failed.");
    }
}
