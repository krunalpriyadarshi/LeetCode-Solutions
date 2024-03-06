class Solution {
    // bad version start index
    static int badPosition= 3;

    public static boolean isBadVersion(int n){
        return (n>= badPosition)? true: false;
    }

    public int firstBadVersion(int n) {
        long left= 1, right= n, mid;
        while(left< right){
            mid= (left+ right)/ 2;
            System.out.println(left+" "+mid+" "+right);
            if(isBadVersion((int)mid)) right= mid;
            else left= mid+ 1;
        }
        return (int) left;
    }

    public static void main(String[] args){
        Solution s= new Solution();
        System.out.println(s.firstBadVersion(5));
    }
}