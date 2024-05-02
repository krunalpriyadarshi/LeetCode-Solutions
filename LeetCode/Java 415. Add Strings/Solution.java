// 415. Add Strings
// url: https://leetcode.com/problems/add-strings/

class Solution {
    public String addStrings(String num1, String num2) {
        // Swap if num1.length is less than num2.length:
        if(num1.length()< num2.length()){
            String temp= num1;
            num1= num2;
            num2= temp;
        }

        int l1= num1.length()- 1, l2= num2.length()- 1;

        int carry= 0, sum;
        StringBuilder sb= new StringBuilder();
        while(true){
            if(l1>= 0 && l2>= 0){
                sum= (num1.charAt(l1--)- '0')+  (num2.charAt(l2--)- '0')+ carry;
            }
            else if(l1>= 0){
                sum= (num1.charAt(l1--)- '0')+ carry;
            }
            else{
                break;
            }
            
            carry= sum/10;
            sum= sum%10;
            sb.append(Integer.toString(sum));
        }

        if(carry!= 0){
            sb.append(Integer.toString(carry));
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String num1 = "11", num2 = "123";
        System.out.println(s.addStrings(num1, num2));
    }
}