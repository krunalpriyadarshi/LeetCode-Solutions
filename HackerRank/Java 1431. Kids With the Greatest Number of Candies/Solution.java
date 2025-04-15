class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int candy : candies){
            if(candy > max)
                max = candy;
        }

        // Instead of finding (candy + extraCandies) >= max. We can reduce computation by preComputing constants.
        max -= extraCandies;
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            result.add(candies[i] >= max);
        }
    
        return result;
    }
}