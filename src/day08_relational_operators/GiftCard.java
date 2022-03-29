package day08_relational_operators;

public class GiftCard {
        /*

        Task declare and assign a gift card with 200
        buy 2 items.
        buy 1 item for x price and subtract from your gist card

        buy item 2  for x price and subtract from your gift card
        print the remaining balance of your gift card

         */

    public static void main(String[] args) {


        double giftCard = 200;

        double itemOne = 100;
        double itemTwo = 40;

        System.out.println("Buy 1 item for 100$ ");
        giftCard -= 100; // giftCard= giftCard - 100

        System.out.println("Buy 2 item for 40$ ");
        giftCard -= 40; // giftCard = giftCard - 40

        System.out.println("Your gift card balance is now " + giftCard);





    }



    }















