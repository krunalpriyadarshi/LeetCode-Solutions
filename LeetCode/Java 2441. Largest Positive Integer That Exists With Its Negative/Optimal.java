// 2441. Largest Positive Integer That Exists With Its Negative
// URL: https://binarysearch.com/problems/Largest-Positive-Integer-That-Exists-With-Its-Negative

import java.util.HashSet;

class Optimal {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hash= new HashSet<>();

        int match= -1;
        for(int i: nums){
            if(hash.contains(i* -1)){
                if(match< (int) Math.abs(i))
                    match= (int) Math.abs(i);
            }
            hash.add(i);
        }

        return match;
    }

    public static void main(String[] args) {
        Optimal optimal= new Optimal();
        int[] nums= {3, 2, -2, 5, -3};
        System.out.println(optimal.findMaxK(nums));
    }
}