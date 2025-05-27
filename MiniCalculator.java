package core_java;
import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("       MINI CALCULATOR ");
        System.out.print("ENTER THE FIRST NUMBER :\n");
        double fn = input.nextDouble();
        System.out.print("ENTER THE SECOND NUMBER :\n");
        double sn = input.nextDouble();
        input.nextLine();
        System.out.println("ENTER THE OPERATION TO PERFORM :\n+ -> Addition\n- ->Subtraction\n* ->Multiplication\n/ ->Division");
        char op = input.next().charAt(0);
        double result;
        switch(op){
            case '+' :
                result = fn + sn ;
                break;
            case '-' :
                result = fn - sn ;
                break;
            case '*':
                result = fn*sn ;
                break;
            case '/':
                result = fn / sn ;
                break;
            default:
                System.out.println("INVALID OPERATION !");
                return;

        }
        System.out.println("Result:"+result);


    }
}
