import java.util.HashMap;
import java.util.Map;

public class New {
    public String kthDistinct(String[] arr, int k){
        Map<String, Integer> map= new HashMap<>();

        for(String key: arr){
            map.merge(key, 1, Integer::sum);
        }

        for(String s: arr){
            if(map.get(s)== 1 && --k== 0)
                return s;
        }

        return "";
    }

    public static void main(String[] args) {
        New sol= new New();

        // test case 1:
        String[] arr= {"abc", "xyz", "pqr", "abc"};
        int k= 2;
        assert sol.kthDistinct(arr, k).equals("pqr"): "Test case 1 failed";

        // test case 2:
        String[] arr2= {"1", "2", "2", "1"};
        k= 100;
        assert sol.kthDistinct(arr2, k).equals(""): "Test case 2 failed";        
    }
}
