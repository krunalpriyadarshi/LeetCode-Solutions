class Solution2 {
    public void swap(int[] nums, int i1, int i2){
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int p = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                swap(nums, i, p);
                p++;
            }
        }

        return p;
    }
}