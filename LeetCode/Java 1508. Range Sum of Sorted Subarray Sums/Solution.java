class Solution {
  public int rangeSum(int[] nums, int n, int left, int right) {
      ArrayList<Integer> process= new ArrayList<>();

      for(int i= 0; i< n; i++){
          int prev= 0;
          for(int j= i; j< n; j++){
              int ans= prev+ nums[j];
              prev= ans;
              process.add(ans);
          }
      }

      Collections.sort(process);

      int ans= 0;

      for(int i= left- 1; i< right; i++){
          ans= (ans+ process.get(i))% (int)(Math.pow(10, 9)+ 7);
      }   

      return ans;     
  }
}