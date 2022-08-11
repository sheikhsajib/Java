package testmathmethods;
 import java.util.Scanner;
public class TestMathMethods {

    public static void main(String[] args) {
        System.out.println(Math.ceil(2.1));     // Return 3.0
        System.out.println(Math.ceil(-2.1));    // Return -2.0
        System.out.println(Math.ceil(-2.7));    // Return -2.0

        System.out.println(Math.floor(3.7));     // Return 3.0
        System.out.println(Math.floor(-3.7));    // Return -4.0
        
        System.out.println(Math.rint(3.7));      // Return 4.0
        System.out.println(Math.rint(3.5));      // Return 4.0

        System.out.println(Math.round(3.5));     // Return 4
        
        System.out.println(Math.log10(10));     // Return 1.0
        System.out.println(Math.pow(2, 3));     // Return 8.0
        System.out.println(Math.pow(4.5, 2.5)); // Return 42.95673695708276
        System.out.println(Math.sqrt(81));     // Return 9

        System.out.println(Math.toDegrees(Math.PI/2));     // Return 90.0
        System.out.println(Math.toRadians(270));     // Return 4.5236 (Same as r/6)
        System.out.println(Math.sin(30));
        
        String s1 = "A";
        String s2 = "D";
        System.out.println(s1.compareTo(s2));   //Compare with  ASCII Value  
        
        String message = "Welcome to Java";
        System.out.println(message.codePointAt(0)); //W = 87 (using codePointAt Method)
        
       
        Scanner keyNumber = new Scanner(System.in);
        
        System.out.println ("Enter a Single Alfabet");
        String userGivenString = keyNumber.nextLine();    
        
        if(userGivenString.equalsIgnoreCase("a") || userGivenString.equalsIgnoreCase("b") || userGivenString.equalsIgnoreCase("c") ){
            System.out.println("KeyBoard Number is 2");
        } 
        else if(userGivenString.equalsIgnoreCase("d") || userGivenString.equalsIgnoreCase("e") || userGivenString.equalsIgnoreCase("F") ){
            System.out.println("KeyBoard Number is 3");
        } 
        if(userGivenString.equalsIgnoreCase("g") || userGivenString.equalsIgnoreCase("h") || userGivenString.equalsIgnoreCase("i") ){
            System.out.println("KeyBoard Number is 4");
        } 
        if(userGivenString.equalsIgnoreCase("j") || userGivenString.equalsIgnoreCase("k") || userGivenString.equalsIgnoreCase("L") ){
            System.out.println("KeyBoard Number is 5");
        } 
        if(userGivenString.equalsIgnoreCase("m") || userGivenString.equalsIgnoreCase("n") || userGivenString.equalsIgnoreCase("o") ){
            System.out.println("KeyBoard Number is 6");
        } 
        if(userGivenString.equalsIgnoreCase("p") || userGivenString.equalsIgnoreCase("q") || userGivenString.equalsIgnoreCase("r") || userGivenString.equalsIgnoreCase("s") ){
            System.out.println("KeyBoard Number is 7");
        }  
        if(userGivenString.equalsIgnoreCase("t") || userGivenString.equalsIgnoreCase("u") || userGivenString.equalsIgnoreCase("v") ){
            System.out.println("KeyBoard Number is 8");
        }       
        if(userGivenString.equalsIgnoreCase("w") || userGivenString.equalsIgnoreCase("x") || userGivenString.equalsIgnoreCase("y") || userGivenString.equalsIgnoreCase("z") ){
            System.out.println("KeyBoard Number is 9");
        }  
    }
    
}
