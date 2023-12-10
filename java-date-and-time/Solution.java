import java.util.HashMap;

// NOT WORKING .............................................................................

class Result{
    public static String findDay(int month, int day, int year){
        // YY is last 2 digit of year. ex., year= 1999 -> YY= 99
        int YY= year% 100;
        // yy_first2 is first 2 digit of year. ex., year= 1999 -> yy_f2= 99
        int yy_first2= year/ 100;
        int yearCode= (YY + (YY/ 4)) %7;

        int[] monthCode= {0,3,3,6,1,4,6,2,5,0,3,5};
        
        HashMap<Integer, Integer> centuryCode= new HashMap<>();
        centuryCode.put(1700, 4);
        centuryCode.put(1800, 2);
        centuryCode.put(1900, 0);
        centuryCode.put(2000, 6);
        centuryCode.put(2100, 4);
        centuryCode.put(2200, 2);
        centuryCode.put(2300, 0);

        int dateCode= (18 -(yy_first2))% 7;
        
        int leapYearCode= 0;
        if((year%4 ==0 && year%100 !=0) || (year/ 400== 0)){
            leapYearCode= 1;
        }

        String[] dayOfWeek= {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        
        return  dayOfWeek[(yearCode+ monthCode[month-1]+ (int)centuryCode.get(year) +dateCode -leapYearCode)% 7];
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println(Result.findDay(8, 05, 2015));
    }
}