import java.util.Scanner;

public class test {

    public static void printStars(int number) {
        // part 1 of the exercise
    }

    public static void printSpaces(int number) {
        for(int i=0 ;i< number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int i=1 ;i<= size; i++){
            printSpaces(size-i);
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void christmasTree(int size) {
        for(int i=1 ;i<= size; i++){
            printSpaces(size-i);
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            for(int j=0; j<i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //base
        printSpaces(size-2);
        System.out.println("***");
        printSpaces(size-2);
        System.out.println("***");

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

