class Solution {
    public void combinationSumHelper(List<List<Integer>> result, List<Integer> currList, int index, int[] candidates, int target){
        if(target == 0){
            result.add(new ArrayList(currList));
            return;
        }
        else if(target < 0)
            return;
        
        for(int i = index; i < candidates.length; i++){
            currList.add(candidates[i]);
            combinationSumHelper(result, currList, i, candidates, target - candidates[i]);
            currList.remove(currList.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        combinationSumHelper(result, temp, 0, candidates, target);

        return result;
    }
}


/*
2 
    2, 0
        2, 0    
            2, 0    x
            3, 1    x
            6, 2    x
        3, 1    <ans>
        6, 2    x
    3, 1
        3, 1    x
        6, 2    x
    6, 2    x


*/