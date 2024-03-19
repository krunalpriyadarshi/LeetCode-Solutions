class Solution {
    public int[] circularGameLosers(int n, int k) {
        int[] arr= new int[n];
        int i= 0, round= 1;

        // increase counter till counter 2 is found.
        arr[0]= 1;
        while(arr[i] != 2){
            i= ((round * k) + i) % n;
            arr[i] += 1;
            round++;
        }
        int size= 0;
        for(i= 0; i< n; i++){
            if(arr[i]== 0) size++;
        }


        // converting into 1-index solution:
        int[] result= new int[size];
        int j = 0;
        for(i= 0; i< n; i++){
            if(arr[i]== 0) result[j++]= i+1;
        }
        return result;
    }
}