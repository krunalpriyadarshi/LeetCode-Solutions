// 719. Find K-th Smallest Pair Distance
import java.util.ArrayList;
import java.util.Collections;

class MLE {
    public int smallestDistancePair(int[] nums, int k) {
        ArrayList<Integer> pairs= new ArrayList<>();

        // creating all pairs:
        // We will hit Memory Limit Exceeded error here because input array size can be 10^ 4.
        // Hence this approach is not feasible.
        for(int i= 0; i< nums.length- 1; i++){
            for(int j= i+ 1; j< nums.length ;j++){
                pairs.add( (int) Math.abs(nums[i]- nums[j]));
            }
        }
        Collections.sort(pairs);

        if(pairs.size()< k)
            return 0;
        else
            return pairs.get(k- 1);
    }

    public static void main(String[] args) {
        MLE mle= new MLE();
        int[] nums= {1, 3, 1};
        int k= 1;
        System.out.println(mle.smallestDistancePair(nums, k));
    }
}