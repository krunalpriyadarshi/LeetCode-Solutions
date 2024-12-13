import java.util.PriorityQueue;

class Solution {
  public long findScore(int[] nums) {
      long res = 0l;
      boolean[] marking = new boolean[nums.length];

      // MinHeap creation:
      PriorityQueue<int[]> heap = new PriorityQueue<>(
          (arr1 , arr2) -> {
              if(arr1[0] != arr2[0])
                  return arr1[0] - arr2[0];
              return arr1[1] - arr2[1];
          }
      );

      // Add elements to Min-heap:        
      for(int i = 0; i < nums.length; i++){
          heap.add(new int[] {nums[i], i});
      }
 
      // Remove a value from minHeap and perform algorithm steps:
      while(!heap.isEmpty()){
          int[] pair = heap.remove();
          int val = pair[0];
          int index = pair[1];

          if(!marking[index]){
              res += val;
              marking[index] = true;

              // Marking "true" adjustcent elements:
              if(index - 1 >= 0)
                  marking[index - 1] = true;
              if(index + 1 < nums.length)
                  marking[index + 1] = true;
          }
      }

      return res;
  }
}