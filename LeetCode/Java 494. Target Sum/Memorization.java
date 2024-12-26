import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

/*
 * Use memorization to store the result of the subproblems to avoid redundant calculations.
 * @param nums: the input array
 * @param target: the target sum
 * @return: the number of ways to form the target sum
 */
class Memorization {
    Map<List<Integer>, Integer> hash = new HashMap<>();

    public int findTargetSumWaysHelper(int[] nums, int index, int target, int sum){
        List<Integer> key = Arrays.asList(index, sum);
        if(hash.containsKey(key)){
            return hash.get(key);
        }

        if(index == nums.length) {
            return (sum == target) ? 1 : 0; 
        }
        
        // Recursive calls for add and subtract
        int add = findTargetSumWaysHelper(nums, index + 1, target, sum + nums[index]) ;
        int subtract = findTargetSumWaysHelper(nums, index + 1, target, sum - nums[index]);

        // Memoize the current state, not the next state
        hash.put(key, add + subtract);

        return hash.get(key);
    }

    public int findTargetSumWays(int[] nums, int target) {
        return findTargetSumWaysHelper(nums, 0, target, 0);
    }
}
