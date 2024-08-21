import java.util.Hashtable;
import java.util.Map;

// Slow because of HashTable initilization.
class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> hash= new Hashtable<>();

        for(int bill: bills){
            System.out.println(hash);
            if(bill== 5){
                hash.put(5, hash.getOrDefault(5, 0)+ 1);
            }
            else if(bill== 10){
                hash.put(10, hash.getOrDefault(10, 0)+ 1);

                if(hash.get(5)!= null && hash.get(5)> 0)
                    hash.put(5, hash.get(5)- 1);
                else 
                    return false;
            }
            else{
                // (bill== 20)
                hash.put(20, hash.getOrDefault(20, 0)+ 1);

                if(hash.get(5)!= null && hash.get(10)!= null && hash.get(5)> 0 && hash.get(10)> 0){
                    hash.put(5, hash.get(5)- 1);
                    hash.put(10, hash.get(10)- 1); 
                }
                else if(hash.get(5)!= null && hash.get(5)> 2)
                    hash.put(5, hash.get(5)- 3);
                
                else
                    return false;
            }
        }

        return true;
    }
}