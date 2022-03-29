package day28_arrays;

import java.util.Scanner;

public class StoreTwo {
    public static void main(String[] args) {
        String [] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPad"};

        // Do we have jackets in stock?





        // use Scanner to ask which item they are looking for, and check if we have it

        Scanner input = new Scanner(System.in);
        System.out.println("Which item are you looking for");
        String lookingFor = input.nextLine();
        boolean inStock = false
                ;

        for(int i = 0; i < items.length; i++){

            if(items[i].equalsIgnoreCase(lookingFor)){
                inStock = true;
                break;
            }


        }
        System.out.println(lookingFor + (inStock ? " in stock" : " out of stock"));





























    }



























}
