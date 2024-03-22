//1408. String Matching in an Array

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result= new ArrayList<>();

        for(String word: words){
            for(String word2: words){
                if(!word.equals(word2) && word2.contains(word)){
                    result.add(word);
                    break;
                }
            }
        }
        return result;
    }
}