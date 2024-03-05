import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;


class Result {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // data process
        for(int i=0; i< grid.size(); i++){
            char[] charArray = grid.get(i).toCharArray();
            Arrays.sort(charArray);
            grid.set(i, new String(charArray));
        }        
        System.out.println(grid + "---grid sorted");

        for(int i=0; i< grid.get(0).length(); i++){
            for(int j= 0; j< grid.size()-1; j++){
               if( (grid.get(j+1).charAt(i)- grid.get(j).charAt(i)) <0  ){
                    return "NO";
               }
            }
        }
        return "YES";
    }
}

class test {
    public static void main(String args[]) {
        System.out.println("");
        System.out.println("");
        
        Result r= new Result();
        String[] str= {"ebacd", "fghij", "olmkn", "ebacd", "xywuv"};

        System.out.println(r.gridChallenge(new ArrayList<>(Arrays.asList(str))));




        System.out.println("");
        System.out.println("");
    }
}