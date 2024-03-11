public class test1 {
    public static void main(String[] args) {
        String a= "anagramm", b1= "marganaa";
        if(a.length()!= b1.length()) System.out.println("----------------------NOT  A anagram");;
        a= a.toLowerCase();
        StringBuilder b= new StringBuilder(b1.toLowerCase());
       for(int i= 0; i< a.length(); i++){
           for(int j= 0; j< b.length(); j++){
               if(a.charAt(i)== b.charAt(j)){
                   b.deleteCharAt(j);
                   break;
               }
           }
       }
       System.out.println((b.length()));
    }
}
