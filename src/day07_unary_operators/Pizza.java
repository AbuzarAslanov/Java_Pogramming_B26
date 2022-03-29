package day07_unary_operators;

public class Pizza {
    public static void main(String[] args) {

        String typeOfPizza = "Cheese";
        int numberOfSlices = 8;
        int numberOfPeople = 4;
        int slicesPerPerson = numberOfSlices / numberOfPeople;
        int slicesLefOver = numberOfSlices % numberOfPeople;

        String report = " We ordered " + typeOfPizza + " pizza with " + numberOfSlices + " slices, " + numberOfPeople + " people ate " + slicesPerPerson + " each with " + slicesLefOver + "  left over ";

        System.out.println(report);








    }







}
