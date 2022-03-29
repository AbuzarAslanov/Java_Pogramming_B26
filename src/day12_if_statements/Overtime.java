package day12_if_statements;

public class Overtime {
    public static void main(String[] args) {

        double hourlyRate = 20.5; //scanner.nextDouble
        double numberOfHours = 40; // scanner.nextDouble
        double netPay;
        String message;

        if (numberOfHours > 40)

        { //when the number of hours more than 40 you will get 1.5 extra overtime pay

            double overTimeHours = numberOfHours - 40;
            netPay = 40 * hourlyRate;
            netPay += overTimeHours * hourlyRate * 1.5;
            message = "You worked" + numberOfHours +  "hours at a rate of" + hourlyRate + ", but " + overTimeHours + " of the hours were overtime, you got and additional pay for those hours";



        } else{ // wen the number of hours less than 40 or equal we will run this code
            netPay = numberOfHours * hourlyRate;

            message = "You worked" + numberOfHours +  "hours at a rate of" + hourlyRate + " there was no overtime. Your net pay was $" + netPay;

            System.out.println("Total net pay is: $" + netPay);


        }
    }

}
