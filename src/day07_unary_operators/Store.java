package day07_unary_operators;

public class Store {
    public static void main(String[] args) {


        String store = "Target";
        int numberOfTvs = 100;

        System.out.println("Person came to the store and bought a TV");
        System.out.println("Number of Tvs now " + --numberOfTvs) ;

        System.out.println("Persons came to the store and put Tv into their cart ");
        System.out.println("Numbers of Tvs in the store " + --numberOfTvs);

        System.out.println("Persons came to the store and put Tv into their cart ");
        System.out.println("Numbers of Tvs in the store " + numberOfTvs--);

        System.out.println("Persons came to the store and put Tv into their cart ");
        System.out.println("Numbers of Tvs in the store " + numberOfTvs--);
        System.out.println("Numbers of Tvs in the store " + numberOfTvs);

        System.out.println("I got a shipment ");
        numberOfTvs = numberOfTvs + 13;

        System.out.println("TVs in Stock: " + numberOfTvs);
















    }













}
