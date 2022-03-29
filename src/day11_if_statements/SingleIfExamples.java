package day11_if_statements;

public class SingleIfExamples {
    public static void main(String[] args) {


        if (false) {
            System.out.println("Hello World"); // if statement is false no print
        }
        System.out.println("Second Line"); // just normal print statement, nothing to do ith if statement

        if(true){
            System.out.println("Today is Monday"); // the if statement is true, so it will print the value




            int score = 60;
            if(score >=75) {


                System.out.println("Passing");
            }


            if(score < 75) {
                System.out.println("Failing");
            }

            int year = 2021;
            boolean lockdown = year == 2020 || year ==2021;
            if(lockdown){
                System.out.println("Stay at home");
                System.out.println("Practice Java");
                System.out.println("Wear mask");


            }

            if(!lockdown){ // !false -> true
                System.out.println("Party");
                System.out.println("Still practice java");
                System.out.println("Maybe travel");

                // in the situation where the lockdown value is true |!true (nottrue) means -> false


            }




        }

    }


}
