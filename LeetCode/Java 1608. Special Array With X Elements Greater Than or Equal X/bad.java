//1608. Special Array With X Elements Greater Than or Equal X

// TC: O(n^ 2)
// very bad 
class Solution {
    public int specialArray(int[] nums) {
        int[] count= new int[nums.length+ 1];

        for(int num: nums){
            for(int i= 0; i< count.length; i++){
                if(i<= num)
                    count[i]++;
            }
        }

        for(int i= count.length- 1; i>= 0; i--){
            // System.out.println(i+" "+ count[i]);
            if(i== count[i])
                return i;
        }

        return -1;
    }
}