package day11_if_statements;

import java.util.Scanner;

public class BankAccount {


    public static void main(String[] args) {



        /*     Create a double value for the account balance.
    Create a double value for how much you want to withdraw

    Check the balance after the withdraw
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over */


        Scanner input = new Scanner(System.in);
        System.out.println("My balance is: ");
        double balance = input.nextDouble();

        System.out.println("My withdraw amount is $: ");
        double myWithdrawAmount = input.nextDouble();




        // withdraw some amount money from my balance
        balance -= myWithdrawAmount; // balance = balance - withdraw

        if (balance < 0){
            System.out.println("Took out too much money, $100 overdraft applied");

            balance -= 100; // ba;ance = balance -100;

            System.out.println("Balance $" + balance);

        } else {
            System.out.println("Your balance is $: " + balance);



        }





    }























}
