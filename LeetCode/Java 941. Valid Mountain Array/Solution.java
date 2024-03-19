class Solution {
    public boolean validMountainArray(int[] arr) {
        int left= 0, right= arr.length- 1;
        while(left< right){
            if(arr[left+ 1]> arr[left]) left++;
            else if(arr[right- 1]> arr[right]) right--;
            else break;
        }
        return left!= 0 && right!= arr.length- 1 && left== right;
    }
}