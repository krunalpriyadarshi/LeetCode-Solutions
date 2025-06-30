class Solution {
    /**
        Calculate Minimum numbers of Flip to make variable c:
            (a | b) == c
        
        Strategy:
            -   Track LSB (Least Significant Bit) of variables
            -   For each bit
                -   If c bit is 1 then either a or b bit requires to be 1. (Else flip any bit)
                -   If c bit is 0 then both a and b require to be 0. (Else flip whichever is 1)

        Time Complexity:
            TC: O(1)    most number of iteration could be 32
        Space Complexity:
            SC: (1)     

        @param a    input integer value a
        @param b    input integer value b
        @param c    input integer value c

        @return     Number of minimum swap of bit requires to convert (a Or b) to value c
     */
    public int minFlips(int a, int b, int c) {
        // Tracking number of minimum flip required:
        int count = 0;

        while(a > 0 || b > 0 || c > 0){
            // If right most bit of variable c is 1:
            if((c & 1) == 1){
                // To make result bit 1, we need right most bit of variable either a or b to 1:
                if((a & 1) == 0 && (b & 1) == 0)
                    count++;
            }
            // If right most bit of variable c is 0:
            else{
                // To make result bit to 0, we need right most bit of both variables to 0:
                if((a & 1) == 1)
                    count++;
                if((b & 1) == 1)
                    count++;
            }

            // Shifting one bit to the right:
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }

        return count;
    }
}