class Solution {
    public boolean isGood(int[] nums) {
        if(nums.length == 1){
            return false;
        }

        int sum= 0, sumOfIndex= 0, match= 0;
        for(int i= 0; i< nums.length; i++){
            if(nums[i]== nums.length-1) match++;
            sumOfIndex+= i+1;
            sum+= nums[i];
        }

        if(match!=2) return false;
        return sumOfIndex- sum -1 == 0;
    }
}