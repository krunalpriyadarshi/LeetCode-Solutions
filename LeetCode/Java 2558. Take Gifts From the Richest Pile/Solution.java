class Solution {
  public long pickGifts(int[] gifts, int k) {
      
      PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
      for(int gift : gifts)
          maxHeap.add(gift);

      for(int i = 0; i < k && maxHeap.peek() > 1; i++){
          int gift = maxHeap.poll();
          maxHeap.add((int) Math.sqrt(gift));
      }

      long sum = 0;
      for(int gift : maxHeap)
          sum += gift;

      return sum;
  }
}