package day13_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
        /*
    ask the user to enter a number based on the language they wanted to use.
    1 - English
    2 - Spanish
    3 - Turkish
    4 - Russian
    5 - French

based on the number they picked print a message:

    1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"
     */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please choose a language: \nEnglish - \nSpanish - \nTurkish - \nRussian - \nFrench");
            int option = input.nextInt();
            String message;

            if(option == 1){
                message = " hello, than you for you call ";
            }else if(option ==2 ){
                message = " hola, gracias para llmar";
            }else if(option ==3 ){
                message = " merhaba aradiginiz icin tesekkurler";
            }else if(option == 4 ){
                message = " privet, sposiba za vash zvonok";
            }else if(option == 5){
                message = " merci, pour votre appel";

            }




        }















}
