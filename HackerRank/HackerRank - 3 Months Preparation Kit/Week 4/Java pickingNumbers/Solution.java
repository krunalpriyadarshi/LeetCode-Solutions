import java.util.List;

class Solution { 
  public static int pickingNumbers(List<Integer> a) {
    // Write your code here
        int freqs[]= new int[100];
        
        for(int i: a){
            freqs[i]++;
        }
        
        int max= 0;
        for(int i= 1; i< freqs.length- 1; i++){
            max= Math.max(max, freqs[i]+ freqs[i+ 1]);
        }
        
        return max;
    }
}
