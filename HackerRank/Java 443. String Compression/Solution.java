class Solution {
    public List<Character> findDigits(int n){
        List<Character> result = new ArrayList<>();
        
        while(n > 0){
            result.add(Character.forDigit(n% 10 , 10));
            n/= 10;
        }

        return result;
    }

    public int compress(char[] chars) {
        int po = 0, i= 0, j= 0;

        while(i < chars.length){
            if(j < chars.length && chars[i] == chars[j]){
                j++;
            }
            else{
                chars[po] = chars[i]; 
                po++;
                int count = j - i;
                i = j;

                if(count == 1)
                    continue;
                else if(count < 10)
                    chars[po++] = Character.forDigit(count, 10);
                else{
                    List<Character> digits = findDigits(count);
                    for(int k = digits.size()-1; k>= 0; k--){
                        chars[po++] = digits.get(k);
                    }
                }
            }
        }

        return po;
    }
}