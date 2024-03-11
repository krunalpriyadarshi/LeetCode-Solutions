class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int diff, i= 0, j= 0;

        if(nums1[nums1.length- 1]< nums2[0] || nums2[nums2.length- 1]< nums1[0]) return -1;

        while(i< nums1.length && j< nums2.length){
            diff= nums1[i]- nums2[j];
            if(diff> 0) j++;
            else if(diff< 0) i++;
            else{
                return nums1[i];
            }
        }
        return -1;
    }
}