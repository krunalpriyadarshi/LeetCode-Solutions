import java.util.HashSet;

public class Test {
    public static void main(String[] args) {   
        int[] nums ={3,-2,1,1};
        
        for(int i : constructTransformedArray(nums)){
            System.out.print(i + " ");
        }

        nums = new int[]{-1,4,-1};

        
        for(int i : constructTransformedArray(nums)){
            System.out.print(i + " ");
        }
    }

    public static int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                result[i] = nums[(nums[i] + i) % nums.length];
            }
            else if(nums[i] < 0){
                result[i] = nums[(nums.length + (nums[i] + i)) % nums.length];
            }
            else
                result[i] = 0;
        }
        return result;
    }
}