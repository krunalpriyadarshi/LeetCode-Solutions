import java.util.Arrays;

class test{
    public static void main(String[] args) {
        int[] nums= {10, 20, 30, 40};


        /*
         *  10 20 30 40
         *  1  10 10*20 10*20*30
         *               10*20*30      
         * 
         * 
         */
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        
        int curr = 1;
        for(int i = 0; i < n; i++) {
            System.out.print("-------------"+ ans[i]+ " "+ curr);
            ans[i] *= curr;
            curr *= nums[i];
            System.out.println("-------------"+ ans[i]+ " "+ curr);
        }
        for(int i: ans){
            System.out.print(i+ " ");
        }
        curr = 1;
        System.out.println("reveres");
        for(int i = n - 1; i >= 0; i--) {
            System.out.print("-------------"+ ans[i]+ " "+ curr);
            ans[i] *= curr;
            curr *= nums[i];
            System.out.println("-------------"+ ans[i]+ " "+ curr);
        }
       
        for(int i: ans){
            System.out.print(i+ " ");
        }
    }
}