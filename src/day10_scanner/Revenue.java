package day10_scanner;
import java.util.Scanner;


/* Write a program that asks the user to enter a price and quantity and then calculate the revenue. revenue = price * quantity

 */


public class Revenue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //make a scanner variable

        // popular names for Scanner: scan, input, scanner , keyboard
        System.out.println("Enter the price of item");

        double price = scanner.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scanner.nextInt();

        double revenue = price * quantity;
        System.out.println("Revenue is " + revenue); // ("Revenue is " + (price * quantity)





    }














}
