import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
  public int findDigitSum(int n){
      int sum = 0;
      while(n > 0){
          sum += (n%10);
          n /= 10;
      }

      return sum;
  }

  public int findMaxSumOfTwo(List<Integer> arr){
    if(arr.size() < 2)
        return -1;

    int max1 = 0, max2 = 0;
    for(int num: arr){
        if(num > max1){
            if(max2 < max1)
                max2 = max1;
            max1 = num;
        }
        else if(num > max2)
            max2 = num;
    }
    
    return max1+ max2;
  }

  public int maximumSum(int[] nums) {
      HashMap<Integer, List<Integer>> hash = new HashMap<>();

      for(int num : nums){
          int digitSum = findDigitSum(num);
          List<Integer> list = hash.getOrDefault(digitSum, new ArrayList<>());
          list.add(num);
          hash.put(digitSum, list);
      }

    int max = -1;
      for(int key: hash.keySet()){
        List<Integer> arr = hash.get(key);        
        max = Math.max(max, findMaxSumOfTwo(arr));
      }  

      return max;
  }

}