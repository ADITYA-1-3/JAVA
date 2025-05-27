package core_java;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NO OF ROWS : ");
        int rows = input.nextInt();
        System.out.println("PATTERN : ");
        for(int i =1;i <=rows ;i++){
            for(int j = 1 ;j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
