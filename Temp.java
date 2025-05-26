package core_java;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        while(true){
        Scanner input = new Scanner(System.in);
        System.out.println("1.FAHRENHEIT TO CELSIUS CONVERSION");
        System.out.println("2.CELSIUS TO FAHRENHEIT CONVERSION");
        System.out.println("3.EXIT");
        System.out.println("ENTER YOUR CHOICE ");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("FAHRENHEIT TO CELSIUS CONVERSION");
            System.out.println("ENTER FAHRENHEIT VALUE : ");
            double val = input.nextDouble();
            double out = (val - 32) * 5 / 9;
            System.out.println("CELSIUS VALUE :" + out);
        }
        if (choice == 2) {
            System.out.println("CELSIUS TO FAHRENHEIT CONVERSION");
            System.out.println("ENTER CELSIUS VALUE ");
            double val = input.nextDouble();
            double out = (val * 9/5) + 32;
            System.out.println("FAHRENHEIT VALUE :" + out);
        }
        if (choice == 3) {
            System.out.println("EXITING THE PROGRAM ");
            break;
        }
    }
    }
}
