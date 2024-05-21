import java.util.ArrayList;
import java.util.List;

class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        result.add(new ArrayList<>());
        int sumXOR= 0;

        for(int num: nums){
            List<List<Integer>> set= new ArrayList<>();
            for(List<Integer> subset: result){
                List<Integer> temp= new ArrayList<>(subset);
                subset.add(num);

                // XOR of a subset:
                int xor= 0;
                for(int val: subset){
                    xor^= val;
                }
                set.add(temp);
                sumXOR+= xor;
            }
            result.addAll(set);
        }

        return sumXOR;
    }
}