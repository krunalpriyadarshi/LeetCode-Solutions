// 2053. Kth Distinct String in an Array

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map= new HashMap<>();

        for(String str: arr){
            map.put(str, map.getOrDefault(str, 0)+ 1);
        }

        for(String str: arr){         
            if(map.get(str)== 1){
                k--;
                if(k== 0)
                    return str;
            }            
        }

        return "";
    }

    public static void main(String[] args) {
        Solution sol= new Solution();
        String[] arr= {"abc", "xyz", "pqr", "abc"};
        int k= 2;

        // Test case 1: Assertion
        assert sol.kthDistinct(arr, k).equals("pqr"): "Test case 1 failed";

        // Test case 2: 
        String[] arr2= {"1", "2", "2", "1"};
        k= 100;

        assert sol.kthDistinct(arr2, k).equals(""): "Test case 2 failed";

    }
}