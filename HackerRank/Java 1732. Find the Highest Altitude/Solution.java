class Solution {
  public int largestAltitude(int[] gain) {
      int max = Integer.MIN_VALUE;

      int sum = 0;
      for(int g : gain){
          sum+= g;
          max = Math.max(max, sum);
      }

      return max < 0 ? 0: max;
  }
}