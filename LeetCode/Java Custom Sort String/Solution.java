import java.util.Hashtable;
class Solution {
    public String customSortString(String order, String s) {
        int[] arr= new int[26];
        for(char ch: order.toCharArray()){
            arr[ch- 'a']= 1;
        }

        for(char ch: s.toCharArray()){
            arr[ch- 'a']+= 1;
        }

        StringBuffer sb= new StringBuffer();
        for(char ch: order.toCharArray()){
            for(int i= 1; i< arr[ch-'a']; i++){
                sb.append(ch);
            }
            arr[ch-'a']= 0;
        }

        for(int i= 0; i< arr.length; i++){
            for(int j= 0; j< arr[i]; j++){
                sb.append((char)(i+'a'));
            }
        }

        return sb.toString();
    }
}