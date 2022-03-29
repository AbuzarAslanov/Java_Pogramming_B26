package MyPackage;

import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter username: ");

        String userName = inp.nextLine();	//enter string value

        if (userName.equals("a1")){

            System.out.print("Enter you password: ");
            String password = inp.next();

            if (password.equals("a123456")) {
                System.out.print("Welcome!");
            }
            else {
                System.out.print("The password is not correct");
            }
        }
        else {
            System.out.print("The username is not correct");
        }
    }
}

