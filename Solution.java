class Solution {
    public int singleNumber(int[] nums) {
        int ans= 0;
        for(int i: nums){
            ans^= i;
        }
        return ans;
    }

    public static void main(String[] args){
        Solution s= new Solution();
        System.out.println(s.singleNumber(new int[]{1, 2, 3, 3, 2}));
    }
}