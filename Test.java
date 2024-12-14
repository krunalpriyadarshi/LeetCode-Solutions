class Solution {
    public long continuousSubarrays(int[] nums) {
        long sum = 0;
        int len = nums.length;

        for(int i = 0; i < len; i++){
            int j = i;
            

            // number of subarray can be created:
            System.out.println(count);
            sum += (count/ 2.0) *(count + 1);
        }

        return sum;
    }
}