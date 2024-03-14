//598. Range Addition II
class Solution {
    public int maxCount(int m, int n, int[][] ops) {    
        int min_x= m;
        int min_y= n;

        for(int[] i: ops){
            min_x= Math.min(i[0], min_x);
            min_y= Math.min(i[1], min_y);            
        }

        return min_x* min_y;
    }
}