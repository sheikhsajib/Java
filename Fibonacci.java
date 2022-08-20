package javaexam;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){

    Scanner inputField = new Scanner(System.in);
    System.out.println("Fibonnaci Range");

    int userRange = inputField.nextInt();
    int pattern1 = 0;
    int pattern2 = 1;
        System.out.print( pattern1 + " ");
        System.out.print( pattern2 + " ");

    for (int i = 3;i <= userRange ; i++) {
    int pattern3 = pattern1 + pattern2;
        System.out.print(pattern3 + " ");
        pattern1 = pattern2;
        pattern2 = pattern3;
    }

    }
}
