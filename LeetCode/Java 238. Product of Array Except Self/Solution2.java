// we can avoid extra loop-iteration which we do in 3rd loop:

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len= nums.length;
        int[] result= new int[len];
        int[] prefix= new int[len];
        int[] postfix= new int[len];

        prefix[0]= 1;
        for(int i= 1; i< len; i++){
            prefix[i]= prefix[i-1]* nums[i-1];
        }

        postfix[len- 1]= 1;
        for(int i= len-2; i>= 0; i--){
            postfix[i]= postfix[i+1]* nums[i+1];
        }

        for(int i= 0; i< len; i++){
            result[i]= prefix[i]* postfix[i];
        }

        return result;
    }
}