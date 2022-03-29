package day28_arrays;

public class MaxAndMin {
    public static void main(String[] args) {

            /*

        declare and assign an array

        500, 120, -80, 90, 250, - 10

        find the biggest number in the array

        find the smallest number in the array

     */

        int[] nums = {500, 120, -80, 25, -10};

        int max = nums[0];
        int min = nums[0];

        int number = 0;
        for (int i = 0; i < nums.length; i++) {

            number = nums[i];
            if (number > max) {
                max = number;
            }
        }
        if (number < min){
            min = number;
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);


    }



























}
