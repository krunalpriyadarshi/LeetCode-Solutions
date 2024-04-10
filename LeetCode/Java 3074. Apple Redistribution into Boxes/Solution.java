// 3074. Apple Redistribution into Boxes

import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sumOfApple= 0;
        for(int i: apple){
            sumOfApple+= i;
        }

        Arrays.sort(capacity);

        int result= 0;
        for(int i= capacity.length; i> 0; i--){
            sumOfApple -= capacity[i-1];
            result++;
            if(sumOfApple< 1) break;
        }      

        return result;  
    }
}