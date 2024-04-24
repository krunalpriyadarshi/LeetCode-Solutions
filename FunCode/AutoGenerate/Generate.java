package FunCode.AutoGenerate;

public class Generate {
    public static void main(String[] args) {
        String str= "hEllO wOrLD";
        StringBuilder sb= new StringBuilder();
        int index= 1;

        while(!str.equals(sb.toString())){
            if(sb.length()< index){
                if(str.charAt(index- 1)== ' ')
                    sb.append(' ');
                else if(Character.isUpperCase(str.charAt(index- 1)))
                    sb.append('A');
                else
                    sb.append('a');
            }
            else{
                if(sb.charAt(index- 1)== str.charAt(index- 1)){
                    index++;
                }
                else{
                    sb.setCharAt(index- 1 , (char)(sb.charAt(index- 1)+ 1));
                }
                
                System.out.println(sb);
            }
        }
    }
}
