// 151. Reverse Words in a String

// Given an input string s, reverse the order of the words.
// TC: O(n) where n is number of words.
class Solution {
    public String reverseWords(String s) {
        String[] arr= s.trim().split(" ");

        StringBuilder result= new StringBuilder();
        for(int i= arr.length- 1; i>= 0; i--){
            if(!arr[i].isEmpty())
                result.append(arr[i]+ " ");
        }

        return result.toString().substring(0, result.length()- 1);
    }
}