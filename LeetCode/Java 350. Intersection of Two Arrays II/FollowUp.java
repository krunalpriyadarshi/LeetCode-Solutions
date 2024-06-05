class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hash= new HashMap<>();

        for(int num: nums1)
            hash.put(num, hash.getOrDefault(num, 0)+ 1);
        
        List<Integer> result= new ArrayList<>();
        for(int num: nums2){
            if(hash.containsKey(num) && hash.get(num)> 0){
                result.add(num);
                hash.put(num, hash.get(num)- 1);
            }
        }

        int[] ans= new int[result.size()];
        int i= 0;
        for(int num: result)
            ans[i++]= num;
        
        return ans;
    }
}