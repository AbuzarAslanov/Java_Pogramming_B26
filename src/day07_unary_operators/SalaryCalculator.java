package day07_unary_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 100_000;
        double statTaxRate = 0.08;  // it means 8%
        double federalTaxRate = 0.21; //21%
        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * statTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;














    }







}
