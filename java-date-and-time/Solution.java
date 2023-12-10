import java.util.HashMap;

class Result{
    public static String findDay(int month, int day, int year){
        int lastTwo= year- ((year/100)*100);
        lastTwo+= (lastTwo/4);

        HashMap <Integer, Integer> arr= new HashMap<Integer, Integer>();
        arr.put(1, 1);
        arr.put(2, 4);
        arr.put(3, 4);
        arr.put(4, 0);
        arr.put(5, 2);
        arr.put(6, 5);
        arr.put(7, 0);
        arr.put(8, 3);
        arr.put(9, 6);
        arr.put(10, 1);
        arr.put(11, 4);
        arr.put(12, 6);

        

        return "st";
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println(Result.findDay(12,9 , 2023));
    }
}
