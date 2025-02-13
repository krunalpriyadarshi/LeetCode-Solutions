class Solution {
  public int findDigitSum(int n){
    int sum = 0;
    while(n > 0){
        sum += (n%10);
        n /= 10;
    }
    return sum;
  }

  public int maximumSum(int[] nums) {
      HashMap<Integer, Integer> hash = new HashMap<>();
      int max = -1;

      for(int num : nums){
          int sumDigit = findDigitSum(num);
          if(hash.containsKey(sumDigit)){
              max = Math.max(max, num + hash.get(sumDigit));
              hash.put(sumDigit, Math.max(num, hash.get(sumDigit)));
          }
          else{
              hash.put(sumDigit, num);
          }
      }

      return max;
  }
}