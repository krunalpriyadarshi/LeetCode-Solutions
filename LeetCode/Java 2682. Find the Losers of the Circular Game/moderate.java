import java.util.HashSet;
class Solution {
    public int[] moderate(int n, int k) {
        HashSet<Integer> set= new HashSet<Integer>();
        // 0-index approach
        int round= 0, holder= 0;
        while(true){
            holder= (holder+ k * round++) % n;
            if(!set.add(holder)) break;
        }

        int[] result= new int[n - set.size()];
        int index= 0;
        for(int i = 0; i < n; i++){
            // 0-index to 1-index
            if(!set.contains(i)) result[index++]= i+1; 
        }

        return result;
    }
}