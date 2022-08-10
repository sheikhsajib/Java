package atmmachine;
import java.util.Scanner;
import java.util.Arrays;

public class AtmMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your ID");
        
        int[] allAccounts = new int[10];
        double[] balance = new double[10];
        for(int i = 0; i < allAccounts.length; i++){
            allAccounts[i] = i;
            balance[i] = 100;
        }
        String messege = "Main Menu \n"
                + "1. Balance \n"
                + "2. Withdraw \n"
                + "3. Deposit \n"
                + "4. exit";
        int userId  = input.nextInt();
        userId = userAccess( userId, allAccounts);
        boolean status = true;
        
        if(userId == -1){
            System.out.println("Enter Valid Id");
        }
        else {
            while(status){
                System.out.println(messege);
                System.out.println("Enter Menu Number");
                int menu = input.nextInt();

                switch(menu){
                    case 1 :
                        boolean subMenu = true;
                        while(subMenu){
                            System.out.println("Your Balance is "+ balance[userId] +" Dolar");
                        String balanceMessege = "Sub Menu \n"
                                + "1. Deposite \n"
                                + "2. Withdraw \n"
                                + "0. Back to Main Menu";
                        System.out.println(balanceMessege + "\n"
                                + "Enter Your Choice");
                        
                        int balanceMenu = input.nextInt();
                            switch(balanceMenu){
                                case 0:
                                    subMenu = false;
                                    break;
                                case 1:
                                    System.out.println("From Submenu Enter Your Deposit Amount \n"
                                            + "Limit 10,000/= for once");
                                    int balanceDeposit = input.nextInt();
                                    if(balanceDeposit <= 10000 && balanceDeposit > 0){
                                        balance[userId] += balanceDeposit;
                                        subMenu = false;
                                    break;
                                    }
                                    else{
                                        System.out.println("This amount cross the deposit limit");
                                        subMenu = false;
                                        break;
                                    
                                    }
                                    
                                case 2:
                                    System.out.println("From Submenu Enter Your Withdrawl Amount \n"
                                            + "Limit 4,000/= for once");
                                    int balanceWithdraw = input.nextInt();
                                    if(balanceWithdraw <= 4000 && balanceWithdraw > 0 ){
                                        if(balance[userId]< balanceWithdraw){
                                            System.out.println("Insuficient Amount");
                                            subMenu = false;
                                            break;
                                        }
                                        else{
                                            balance[userId] -= balanceWithdraw;
                                            subMenu = false;
                                            break;
                                        }
                                    }
                                    else{
                                        System.out.println("This amount cross the withdraw limit");
                                        subMenu = false;
                                        break;
                                    }
                                
                            }
                        }//subMenu While Case 1;
                        break;
                    case 2:
                        System.out.println("Enter Your Withdrawl Amount \n"
                                + "Limit 5,000/= for once");
                        int balanceWithdraw = input.nextInt();
                        if(balanceWithdraw <= 5000 && balanceWithdraw > 0){
                            balance[userId] -= balanceWithdraw;
                            break;
                        }
                        else{
                            System.out.println("This amount cross the withdraw limit");
                            break;
                        }
                        
                    case 3:
                        System.out.println("Enter Your Deposit Amount \n"
                                + "Limit 10,000/= for once");
                        int balanceDeposit = input.nextInt();
                        if(balanceDeposit <= 10000 && balanceDeposit > 0){
                            balance[userId] += balanceDeposit;
                        break;
                        }
                        else{
                            System.out.println("This amount cross the deposit limit");
                        break;
                        }
                    case 4:
                        status = false;
                    default:
                        System.out.println("Wrong Number");
                }
            }
        }
        
//        System.out.println(Arrays.toString(allAccounts));
//        System.out.println(Arrays.toString(balance));
        
    }//Main Method
    public static int userAccess( int xUser, int xAllAcc[]){
        for(int ac : xAllAcc){
             if(xUser == ac){
                 return xUser;
            }
        }
        return -1;
    }
}//Main Class
