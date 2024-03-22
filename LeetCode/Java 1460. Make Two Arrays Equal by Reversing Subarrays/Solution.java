//1460. Make Two Arrays Equal by Reversing Subarrays;
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        boolean match= false;
        for(int i= 0; i< target.length; i++){
            for(int j= 0; j< arr.length; j++){
                match= false;
                if(target[i]== arr[j]){
                    match= true;
                    arr[j]= -1;
                    break;
                }
            }
            if(!match) return false;
        }
        return true;
    }
}