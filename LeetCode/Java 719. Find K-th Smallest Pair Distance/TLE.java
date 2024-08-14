// 719. Find K-th Smallest Pair Distance

import java.util.PriorityQueue;

public class TLE {
    public int smallestDistancePair(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        for(int i= 0; i< nums.length- 1; i++){
            for(int j= i+ 1; j< nums.length; j++){
                int distance= Math.abs(nums[i]- nums[j]);
                pq.add(distance);

                // MLE reached as k's value is too high.
                if(pq.size()> k)
                    pq.poll();
            }
        }

        return pq.poll();
    }

    public static void main(String[] args) {
        TLE tle= new TLE();
        int[] nums= {1, 3, 1};
        int k= 1;
        System.out.println(tle.smallestDistancePair(nums, k));
    }
}