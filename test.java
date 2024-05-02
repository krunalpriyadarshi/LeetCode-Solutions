public class test {
    public static void main(String[] args) {
        String s="abc";
        char[] arr= (s.substring(1, s.length())+ s.substring(0, s.length()- 1)).toCharArray();

        for(char ch: arr){
            System.out.print(ch);
        }
    }
}