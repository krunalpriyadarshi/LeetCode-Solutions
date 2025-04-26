class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        int skipCount = 0;
        for(int i= s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '*'){
                skipCount++;
            }
            else{
                if(skipCount > 0){
                    skipCount--;
                    continue;
                }
                sb.append(s.charAt(i));
            }
        }

        return sb.reverse().toString();
    }
}