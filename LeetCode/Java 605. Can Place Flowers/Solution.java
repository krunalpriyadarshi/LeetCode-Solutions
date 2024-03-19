//605. Can Place Flowers
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev, next;

        for(int i= 0; i< flowerbed.length; i++){
            if(flowerbed[i]== 1){
                continue;
            }

            prev= i- 1;
            next= i+ 1;

            if ((prev == -1 || flowerbed[prev] == 0) && (next == flowerbed.length || flowerbed[next] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
