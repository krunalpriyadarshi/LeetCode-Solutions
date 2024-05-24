// To run code: "java -ea Optimal.java"

// TC: O(n)
class Optimal {
    public int longestPalindrome(String s) {
        int[] ASCII= new int[126];

        // Frequency count:
        for(char ch: s.toCharArray())
            ASCII[ch]++;
        
        // To find max-len Palindrome:
        // include all even length char 
        // if char is odd then reduce it by one to make it even.
        int result= 0;
        for(int val: ASCII){
            if(val% 2!= 0)
                val--;
            result+= val;
        }

        // we can still include odd number of one char if exists:
        return (result== s.length())? result: ++result;
    }

    public static void main(String[] args) {
        Optimal op= new Optimal();

        // Case 1: Empty string
        assert op.longestPalindrome("")== 0: "FAILED Test-case 1";

        // Case 2: even freqs of each char
        assert op.longestPalindrome("aabbcc")== 6: "FAILED Test-case 2";

        // Case 3: odd freqs of each char
        assert op.longestPalindrome("aaabbbccc")== 8: "FAILED Test-case 3";
    }
}