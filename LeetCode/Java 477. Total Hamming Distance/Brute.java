// 477. Total Hamming Distance

// Divide and Modulus approach to check bit consumes lot of time.
class Brute {
    public int hummingDistance(int num){
        int count= 0;

        while(num> 0){
            if(num% 2== 1)
                count++;
            num/= 2;
        }

        return count;
    }

    public int totalHammingDistance(int[] nums) {
        int ans= 0;

        for(int i= 0; i< nums.length- 1; i++){
            for(int j= i+ 1; j< nums.length; j++){
                int n= nums[i]^ nums[j];
                ans+= hummingDistance(n);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Brute brute= new Brute();
        int[] nums= {4, 14, 2};
        System.out.println(brute.totalHammingDistance(nums));
    }
}