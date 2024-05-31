
import java.util.HashMap;

public class Ht {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map= new HashMap<>();

        int[] nums= {1,2,1,3,2,5};

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }

        int[] res= new int[2];
        int i= 0;
        for(int num: nums){
            if(map.get(num)== 1){
                res[i]= num;
                i++;
            }
        }

        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
