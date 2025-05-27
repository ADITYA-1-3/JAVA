package core_java;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("        LEAP YEAR CHECK ");
        System.out.println("ENTER THE YEAR :");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("IT'S A LEAP YEAR ");
        }
        else{
            System.out.println("IT'S NOT A LEAP YEAR ");
        }
    }
}
