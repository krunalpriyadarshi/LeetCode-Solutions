class Solution {
    public long findScore(int[] nums) {
        int[][] pair = new int[nums.length][2];
        int index = 0;
        // Create 2D array of num value & their index:
        for(int num : nums){
            pair[index][0] = num;
            pair[index][1] = index;
            index++;
        }

        Arrays.sort(pair, (a, b) -> a[0] - b[0]);
        //System.out.println(Arrays.deepToString(pair));

        boolean[] isMarked = new boolean[nums.length];
        long result = 0l;
        for(int[] p : pair){
            int val = p[0];
            index = p[1];
            if(!isMarked[index]){
                result += val;

                // marking: itself and its adjacent elements:
                isMarked[index] = true;
                if(index + 1 < nums.length)
                    isMarked[index + 1] = true;
                if(index - 1 >= 0)
                    isMarked[index - 1] = true;
            }
        }

        return result;
    }
}