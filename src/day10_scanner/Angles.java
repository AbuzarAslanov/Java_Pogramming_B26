package day10_scanner;
import java.util.Scanner;


public class Angles {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 3 angle numbers");

        double angleOne = keyboard.nextDouble();
        double angleTwo= keyboard.nextDouble();
        double angleThree = keyboard.nextDouble();

        double sum = angleOne + angleTwo + angleThree;


        boolean isTriangle = angleOne + angleTwo + angleThree == 180;
        boolean isCircle = angleOne + angleTwo + angleThree == 360;


        System.out.println("Is Triangle " + isTriangle);
        System.out.println("Is Circle " + isCircle);









        }





    }
















