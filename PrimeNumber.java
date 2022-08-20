import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner inputField = new Scanner(System.in);
        System.out.print("Enter a Number to Check Prime Number : ");
        int userNumber = inputField.nextInt();
        int c = 0;
        for (int i = 1; i <= userNumber; i++) {
            if (userNumber % i == 0) {
                c++;
            }
        }

        if (c == 2) {
            System.out.println(userNumber + " is a Prime Number");
        } else {
            System.out.println(userNumber + " is not a Prime Number");
        }
    }
    
}
