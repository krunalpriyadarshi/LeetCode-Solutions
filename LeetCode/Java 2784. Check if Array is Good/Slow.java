import java.util.Arrays;

class Solution {
    public boolean slow(int[] nums) {
        int arr = nums[0];
        int sum = nums.length - 1;
        int c = 0;
        if (nums[0] == nums.length - 1)
            c++;
            
        for (int i = 1; i < nums.length; i++) {
            sum += i;
            arr += nums[i];
            if (nums[i] == nums.length - 1)
                c++;
        }
        if (sum == arr && c == 2)
            return true;
        else
            return false;

    }
}