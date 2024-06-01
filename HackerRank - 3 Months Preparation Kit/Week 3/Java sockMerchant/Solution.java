import java.util.List;

class Solution { 
  public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        int count[]= new int[101];
        int result= 0; 
        for(int i: ar){
            if(count[i]== 1){
                count[i]= 0;
                result++;
            }
            else{
                count[i]++;
            }
            
        }
        return result;
    }
}
