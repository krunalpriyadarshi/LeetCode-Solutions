class Solution {
    public static void reverseArr( int[] arr, int start, int end ){
       while( start<end ){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
               end--; start++;
       }
   }
   
   public void rotate(int[] nums, int k) {
       int len = nums.length;
       k=k%len;
       len--;
       reverseArr(nums, 0, len);
       reverseArr(nums, 0, k-1);
       reverseArr(nums, k, len);
   }
}