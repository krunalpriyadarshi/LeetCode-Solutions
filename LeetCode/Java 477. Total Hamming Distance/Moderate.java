// 477. Total Hamming Distance

// useing Integer.bitCount() method to count bit in Number.
public class Moderate {
    public int totalHammingDistance(int[] nums) {
        int ans= 0;
        
        for(int i= 0; i< nums.length- 1; i++){
            for(int j= i+ 1; j< nums.length; j++){
                int n= nums[i]^ nums[j];
                ans+= Integer.bitCount(n);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Moderate moderate= new Moderate();
        int[] nums= {4, 14, 2};
        System.out.println(moderate.totalHammingDistance(nums));
    }
}
