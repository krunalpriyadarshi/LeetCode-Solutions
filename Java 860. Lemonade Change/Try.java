import java.util.Hashtable;
import java.util.Map;

public class Try {
    public boolean lc(int[] bills) {
        Map<Integer, Integer> hash= new Hashtable<>();

        for(int bill: bills){
            if(bill== 5)
                hash.put(5, hash.getOrDefault(5, 0)+ 1);
            else if(bill== 10){
                if(hash.get(5)> 0){
                    hash.put(5, hash.get(5)- 1);
                }
                else{
                    return false;
                }
            }
            else{
                if((hash.get(10)> 0 && hash.get(5)> 0) || hash.get(5)> 1){
                    hash.put(10, hash.get(10)- 1);
                    hash.put(5, hash.get(5)- 1);
                }
                else{
                    return false;
                }
            }
        }

        return true;
    }
}
