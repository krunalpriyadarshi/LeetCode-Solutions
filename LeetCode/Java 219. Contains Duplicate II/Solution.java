import java.util.Hashtable;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Hashtable<Integer, Integer> hash= new Hashtable<Integer, Integer>();
        
        int match;
        for(int i= 0; i< nums.length; i++){
            if(hash.containsKey(nums[i])){
                match= hash.get(nums[i]);
                if(Math.abs(match- i)<= k){
                    return true;
                }
                else{
                    hash.put(nums[i], i);
                }
            }
            else{
                hash.put(nums[i], i);
            }
        }
        return false;
    }
}