class Solution {
    public int hammingWeight(int n) {
        int ans= 0;

        while(n> 0){
            if(n% 2== 1)
                ans++;
            n/= 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        assert s.hammingWeight(11)== 3: "Test case 1 failed";
        assert s.hammingWeight(128)== 1: "Test case 2 failed";
    }
}