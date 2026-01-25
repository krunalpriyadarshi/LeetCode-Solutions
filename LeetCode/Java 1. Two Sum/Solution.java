
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int tap=target-nums[i];
            if(hmap.containsKey(tap)){
                 return new int[]{hmap.get(tap),i};
            }
            hmap.put(nums[i],i);
        }
        return null;
        
    }
}