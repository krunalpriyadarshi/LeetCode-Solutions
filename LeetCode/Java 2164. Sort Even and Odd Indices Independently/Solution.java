//2164. Sort Even and Odd Indices Independently;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] oddIndices= new int[ nums.length / 2 ];
        int[] evenIndices= new int[ (nums.length + 1) / 2 ];

        int odd= 0, even= 0;
        for(int i= 0; i< nums.length; i++){
            if(i%2==0){
                evenIndices[even++]= nums[i];
            }else{
                oddIndices[odd++]= nums[i];
            }
        }

        Arrays.sort(evenIndices);
        Arrays.sort(oddIndices);

        int index= 0;
        odd= oddIndices.length-1;
        even= 0;
        for(int i= 0; i< nums.length; i++){
            if(i%2==0){
                nums[i]= evenIndices[even++];
            }else{
                nums[i]= oddIndices[odd--];
            }
        }

        return nums;
    }
}