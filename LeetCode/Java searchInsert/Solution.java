class Solution {
    public int searchInsert(int[] nums, int target) {
        int i= 0, j= nums.length, mid;
        
        while(i< j){
            mid= (i+ j)>>>2;
            if(mid== target) return mid;
            else if(mid> target) j= mid;
            else i= mid+1;
        }
        return i;
    }

    public static void main(String[] args){
        Solution s= new Solution();
        System.out.println(s.searchInsert(new int[] {5, 10, 15, 20, 25}, 10));
    }
}