package day12_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers20");
       /* declare and assign 3 int variables
        between the 3 numbers find the print the biggest one */

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();



        //int num1 = 63;
        //int num2 = 43;
        //int num3 = 67;

        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is the biggest");
        }else if(num2>num1 && num2>num3){
            System.out.println(num2 + " is the biggest");
        }else{
            System.out.println(num3 + " is the biggest");
        }

    }



















}
