class Slow {
    public int hammingDistance(int x, int y) {
        String uniqueBits= Integer.toBinaryString(x^ y);
        int ans= 0;

        // convertion to string and iterating over it is time consuming:
        for(char ch: uniqueBits.toCharArray()){
            if(ch== '1')
                ans++;
        }

        return ans;
    }
}