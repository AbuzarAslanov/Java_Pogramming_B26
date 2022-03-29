package day24_loop;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        int spaces = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){ //str.substring(i , i + 1).equals(" ")
                spaces++;
            }
        }
        System.out.println("Number of words: " + (spaces + 1));



    }




































}
