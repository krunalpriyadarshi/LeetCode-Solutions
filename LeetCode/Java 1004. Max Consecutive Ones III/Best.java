class Solution {
    public int longestOnes(int[] n, int k) {
        int count= k, i = 0, j= 0;
        int ans = 0;

        while(j < n.length){
            //System.out.println(i + " " + j);
            
            if(n[j] == 1){
                j++;
            }
            else{
                if(count > 0){
                    count--;
                    j++;
                }
                else{
                    ans = Math.max(ans, j- i);

                    while(i<= j && n[i] != 0){
                        i++;
                    }
                    i++;
                    count++;
                }
            }
        }

        return Math.max(ans, j - i);
    }
}

/*

1 1 0 1 1 0 0 1 1 1 1 1 1 0 1 1 0 1 1 


[0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1]
*/