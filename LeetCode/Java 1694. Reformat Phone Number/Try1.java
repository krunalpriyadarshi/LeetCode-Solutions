// 1694. Reformat Phone Number:
// 3ms solution
class Try1 {
    public String reformatNumber(String number) {
        if(number.length()==2) return number;
        
        number= number.replaceAll("[- ]", "");

        StringBuilder sb= new StringBuilder();
        if(number.length()% 3== 0){
            for(int i= 0; i< number.length(); i+=3){
                sb.append(number.substring(i, i+3)+"-");
            }
            sb.deleteCharAt(sb.length()-1);
        }
        else if((number.length()- 2)% 3 == 0){
            // 5
            for(int i= 0; i< number.length()- 2; i+=3){                
                sb.append(number.substring(i, i+3)+"-");
            }
            sb.append(number.substring(number.length()-2, number.length()));
        }
        else if((number.length()- 4)% 3== 0){
            //7            
            for(int i= 0; i< number.length()- 4; i+=3){                
                sb.append(number.substring(i, i+3)+"-");
            }

            sb.append( number.substring( number.length()-4, number.length()-2 ) );
            sb.append( "-" );
            sb.append( number.substring( number.length()-2, number.length() ) );
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Try1 obj= new Try1();
        System.out.println(obj.reformatNumber("123 4-567"));
    }
}