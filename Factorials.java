package javaexam;

import java.util.Scanner;

public class Factorials {

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Your Factorial Number : ");

    int userNumber = input.nextInt();
    int fact = 1;
    for(int i = userNumber; 1<=i ; i--){
        fact *= i;
    }
        System.out.println("Factorial Number of " + userNumber +" is " +fact);
	
    }
    
}
