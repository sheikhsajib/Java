package minmaxwithoutmath;
import java.util.Scanner;

public class MinMaxWithOutMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many number you want to Show");
        int totalNumber = input.nextInt();
        
        int[] allNumbers = new int[totalNumber];
        for (int i = 0; i< allNumbers.length; i++){
            System.out.println("Enter no "+i+" number: ");
            allNumbers[i] = input.nextInt();
        }
        
        int max =0;
        int min = allNumbers[0];
        for(int n : allNumbers){
            if(max < n){
                max = n;
            }
            if(min>n){
                min = n;
            }
        }
        System.out.println("Max Number is "+max);
        System.out.println("Min Number is "+min);
    }
}
