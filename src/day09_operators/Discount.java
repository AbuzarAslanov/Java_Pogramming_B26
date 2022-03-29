package day09_operators;

public class Discount {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isTeacher = true;
        boolean isPoliceOfficer= false;
        boolean isFireFighter = false;

        boolean getDiscount = isWeekend &&
                (isTeacher || isPoliceOfficer || isFireFighter);

        System.out.println(getDiscount);


















    }













}
