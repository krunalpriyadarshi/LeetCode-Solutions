// Source: https://leetcode.com/problems/day-of-the-year/

import java.util.Arrays;

class Solution {
    public int dayOfYear(String date) {
        int[] daysInMonth= {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334}; 

        int[] data = Arrays.stream(date.split("-")).mapToInt(Integer::parseInt).toArray();
        
        if(data[1]< 3)
            return daysInMonth[data[1]]+ data[2];

        boolean isLeapYear= data[0]% 400== 0 || (data[0]%100!= 0 && data[0]%4== 0);

        return daysInMonth[data[1]]+ data[2]+ (isLeapYear? 1: 0);
    }
}