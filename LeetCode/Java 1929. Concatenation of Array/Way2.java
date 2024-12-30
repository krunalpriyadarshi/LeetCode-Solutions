class Way2 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int n = nums.length;
        for(int i = 0, j = 0; i < ans.length; i++, j++){
            if(j == n)
                j = 0;
            ans[i] = nums[j];
        }
        
        return ans;
    }
}