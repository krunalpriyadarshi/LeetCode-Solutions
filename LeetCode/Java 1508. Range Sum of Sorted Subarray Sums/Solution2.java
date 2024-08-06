import java.util.Arrays;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] data= new int[n* (n+1)/ 2];
        int k= 0;

        for(int i= 0; i< n; i++){
            int prev= 0;
            for(int j= i; j< n; j++){
                int curr= prev+ nums[j];
                data[k++]= curr;
                prev= curr;
            }
        }

        Arrays.sort(data);
        int ans= 0;

        for(int i= left- 1; i< right; i++){
            ans= (ans+ data[i])% (int) (Math.pow(10, 9)+ 7);
        }

        return ans;
    }
}