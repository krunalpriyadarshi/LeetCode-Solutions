import java.util.Map;
import java.util.HashMap;

/*
 * Brute Force - Creating each string of length [ZERO, HIGH] and find total numbers of good strings.
 * 
 * Time Complexity: O(2^N)
 * @Param low - minimum length of string
 * @Param high - maximum length of string
 * @Param zero - length of ZERO string
 * @Param one - length of ONE string
 * 
 * @Return total number of good strings.
 */
class BruteForce {
    Map<Integer, Integer> hash = new HashMap<>();
    int LOW, HIGH, ZERO, ONE;
    int MODULO = 1000000007;

    public int dfs(int val){
        if(hash.containsKey(val))
            return hash.get(val);

        if(val > HIGH)
            return 0;
        
        int val3 = (LOW <= val) ? 1 : 0;

        // Including ZERO string to original String:
        int key1 = (val + ZERO) % MODULO;
        int val1 = dfs(key1);
        hash.put(key1, val1);
        
        // Including ONE string to original String:
        int key2 = (val + ONE) % MODULO;
        int val2 = dfs(key2);
        hash.put(key2, val2);

        return val1 + val2 + val3;
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        ZERO = zero;
        ONE = one;
        LOW = low;
        HIGH = high;

        return dfs(0);
    }
}