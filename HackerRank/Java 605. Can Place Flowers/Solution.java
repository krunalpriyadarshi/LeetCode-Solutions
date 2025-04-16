class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        
        for(int i = 0; i< arr.length && n > 0; ){
            if(arr[i] == 0){
                if(i - 1 < 0  || arr[i- 1]== 0){
                    if(i + 1 >= arr.length || arr[i+ 1]== 0){
                        arr[i] = 1;
                        i+= 2;
                        n--;
                    }
                    else{
                        i+= 3;
                    }
                }
                else{
                    i++;
                }
            }
            else
                i+= 2;
        }

        return (n == 0);
    //     before place -1 and +1 place    --> after place +2
    //     make sure to handle ArrayOutOfIndex exception

    //    1--> +2
    //    0--> +1
    }
}