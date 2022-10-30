package teamwork_29102022;

import java.util.Scanner;

public class MenuDrivenAtmProject {
    public static void main(String[] args) {
        int balance= 5000; //8000
        String choice=showMenu().toUpperCase();
        switch (choice){
            case "1" -> {
                System.out.println("Please enter amount you want to withdraw: ");
                while(true){
                int withdrawAmount= new Scanner(System.in).nextInt();
                if (balance >= withdrawAmount){
                    System.out.println("Take your money! ");
                    balance -= withdrawAmount;
                    System.out.printf("Your new balance: %5d", balance);
                    break;
                }
                else{
                    System.out.println("Insufficient Funds. Try new amount: ");
                }
            }
            }case "2" -> {
                System.out.println("Please enter amount you want to deposit: ");
                int depositAmount= new Scanner(System.in).nextInt();
                balance +=depositAmount;
                System.out.printf("Your neew balance: %5d", balance);

            }case "3" -> {
                System.out.println("Your current balance: " + balance);
            }case "E" -> {
                System.out.println("You logged off system. ");
                System.exit(0);
            }default -> System.out.println("Wrong choice!");
        }



        /* Lets Build a Java Program, to represent ATM Transaction,
Following are the basic operations available in the ATM

1-Withdraw
2-Deposit
3-Check Balance
4-Exit

A. Withdraw:
Take the amount user desires to withdraw as input.
If the balance amount greater than or equal to the withdrawal amount then give the user the desired amount.
Else print Insufficient Funds message.

B. Deposit:
Take the amount user desires to deposit as input.
Add the received input from the user to balance and update its value.
Print a message on screen stating deposit transaction has been successful.

C. Check Balance:
Print a message on screen showing the value of balance amount.

D. Exit:
Exit the current Transaction mode and return the user to the home page or initial screen.*/



    }
    public static String showMenu() {
        System.out.println("Menu");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check Balance");
        System.out.println("E. EXIT");
        return new Scanner(System.in).nextLine();
    }
}