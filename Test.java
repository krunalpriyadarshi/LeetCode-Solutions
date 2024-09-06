
public class Test {
    public static void main(String[] args) {   
        String coordinate1 = "d6", coordinate2 = "e5";
        boolean isOddNumber, isOddChar;

        isOddChar= (coordinate1.charAt(0)- 'a'+ 1)% 2== 1;
        isOddNumber= (coordinate1.charAt(1)- '0')% 2== 1;
        boolean isBlack1= isOddChar== isOddNumber;
        System.out.println(isBlack1+ " "+ isOddChar+ " "+ isOddNumber);

        isOddChar= (coordinate2.charAt(0)- 'a'+ 1)% 2== 1;
        System.out.println((coordinate2.charAt(0)- 'a')+ 1);
        isOddNumber= coordinate2.charAt(1)- '1'% 2== 1;
        boolean isBlack2= isOddChar== isOddNumber;
        System.out.println(isBlack2+ " "+ isOddChar+ " "+ isOddNumber);

    }
}
