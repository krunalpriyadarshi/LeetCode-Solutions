// 1154. Day of the Year
// https://leetcode.com/problems/day-of-the-year/

class Solution2 {
  public int dayOfYear(String date) {
      // case: leap year ==>  year% 4 && year% 400
      String[] arr= date.split("-");
      int days= 0;

      // mapping of no of days before this month.
      switch(arr[1]){
          case "02":
              days= 31;
              break;
          case "03":
              days= 59;
              break;
          case "04":
              days= 90;
              break;
          case "05":
              days= 120; 
              break;
          case "06":
              days= 151; 
              break;
          case "07":
              days=  181;
              break;
          case "08":
              days= 212;
              break;
          case "09":
              days= 243;
              break;
          case "10":
              days= 273;
              break;
          case "11":
              days= 304;
              break;
          case "12":
              days= 334;
              break;
      }
      int year= Integer.valueOf(arr[0]);
      int leapYearDays= ((year% 4== 0 && year%100!= 0)|| year% 400== 0)? 1: 0;
      if(arr[1].equals("01") || arr[1].equals("02")){
          leapYearDays= 0;
      }
      return days+ Integer.valueOf(arr[2]) + leapYearDays;
  }
}