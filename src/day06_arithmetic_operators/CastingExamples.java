package day06_arithmetic_operators;

public class CastingExamples {
    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne;

        System.out.println(numOne);
        System.out.println(numTwo);  // short is smaller than float, so no casting needed

        float num3 = 100.5F;   // you can't leave it like that and have to add F.
        short num4 = (short)num3;     // float is bigger so we cast down to short ; short num4 = num3; --> (short)num3

        System.out.println(num3);
        System.out.println(num4);

        float num5 = 300;
        byte num6 = (byte)num5;


        System.out.println(num5);// 30 is int by default , at it automatically goes up tp float
        System.out.println(num6);


        char letter = 'A';
        int letter2 = letter;

        System.out.println(letter);
        System.out.println(letter2);
        System.out.println((int)(letter));














    }








}
