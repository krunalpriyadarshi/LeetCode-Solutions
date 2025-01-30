class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        int minCount = (nums.length/ 3);
        for(int key : map.keySet()){
            if(map.get(key) > minCount)
                result.add(key);
        }

        return result;
    }
}