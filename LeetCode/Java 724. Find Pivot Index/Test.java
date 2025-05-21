class Solution {
    public int pivotIndex(int[] nums) {
        int ans = -1, len = nums.length;
        
        int[] pre = new int[len];
        int sum = 0;
        for(int i = 0; i < len ; i++){
            pre[i] = sum;
            sum += nums[i];
        }

        int[] post = new int[len];
        sum = 0;
        for(int i= len- 1; i>= 0; i--){
            post[i] = sum;
            sum += nums[i];
        }

        for(int i = 0; i < len ; i++){
            if(pre[i] == post[i]){
                ans = i;
                break;
            }
        }

        return ans;
    }
}


/*
0 1 8 11 17 22
27 20 17 11 6 0

*/