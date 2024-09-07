// 347. Top K Frequent Elements

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int num: nums){
            hash.put(num, hash.getOrDefault(num, 0)+ 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =  new PriorityQueue<>(
            (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );

        for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
            maxHeap.offer(entry);
        }

        int[] ans= new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = maxHeap.poll().getKey();
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = s.topKFrequent(nums, k);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }

        // testCase 1:
        assert s.topKFrequent(nums, k)== new int[]{1, 2}: "Test case 1 failed";
    }
}