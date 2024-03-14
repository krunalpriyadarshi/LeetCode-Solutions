//496. Next Greater Element I
class Solution {
    public int[] nextGreaterElement(int[] a, int[] b) {
        int[] ans= new int[a.length];
        
        for(int i= 0; i< a.length; i++){
            ans[i]= -1;
            for(int j =0; j< b.length; j++){
                if(a[i]== b[j]){
                    for(int k=j+1; k< b.length; k++){
                        if(b[k]> a[i]){
                            ans[i]= b[k];
                            break;
                        }
                    }
                }
            }
        }

        return ans;
    }
}