import java.util.ArrayList;
import java.util.Scanner;

public class first {

    public int minimumLength(String str) {
       char[] chars= str.toCharArray();
        int i=0, j= str.length()-1;
        char ch;

        while(j>i){
            if(chars[i]!= chars[j]) break;
            ch= chars[i];
            while(j>=i && chars[i]== ch) i++;
            while(j>=i && chars[j]== ch) j--;
        }
        return j-i+1;
    }

    public static void main(String[] args) {
        first f = new first();
        String str = "aabccbaaaaa";
        System.out.println(f.minimumLength(str));

    }
}
