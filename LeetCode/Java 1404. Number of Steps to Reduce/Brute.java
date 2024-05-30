// 1404. Number of Steps to Reduce

class Solution {
    public int numSteps(String s) {
        int steps= 0;
        StringBuilder sb= new StringBuilder(s);

        while(!sb.toString().equals("1")){
            if(sb.charAt(sb.length()- 1)== '0'){
                steps++;
                sb= sb.deleteCharAt(sb.length()- 1);
            }
            else{
                int i= sb.length()- 1, carry= 1;
                while(i>= 0){
                    if(sb.charAt(i)== '0'){
                        sb.setCharAt(i, '1');
                        carry= 0;
                        break;
                    }
                    else{
                        sb.setCharAt(i, '0');
                    }
                    i--;
                }

                if(carry== 1)
                    sb.insert(0, '1');
                
                steps++; 
            }
        }

        return steps;
    }
}