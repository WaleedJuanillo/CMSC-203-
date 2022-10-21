import Calculator.Calcu;
import java.util.Scanner;

public class CalculatorCmsc203 {

    /**
     * @param args
     */
    public static void main(String[] args){

        Calcu calculator = new Calcu();
        
        try(Scanner scan = new Scanner(System.in)){
           
            while (true) {
                System.out.print("First Number: ");
                int num1 = scan.nextInt();

                System.out.print("Second Number: ");
                int num2 = scan.nextInt();
                System.out.println();               
                System.out.println("Select Operator: ");
                System.out.println();
                System.out.println("[1] Addition");
                System.out.println("[2] Subtraction");
                System.out.println("[3] Multiplication");
                System.out.println("[4] Division");    
                System.out.println();
                System.out.print("Operator: ");                           
                int operator = scan.nextInt();

                float result = 0;               

                switch (operator) {
                    case 1:
                        result = calculator.Addition(num1, num2);
                        break;
                    case 2:
                        result = calculator.Subtraction(num1, num2);
                        break;
                    case 3:
                        result = calculator.Multiplication(num1, num2);
                        break;
                    case 4:
                        result = calculator.Division(num1, num2);
                        break;               
                    default:
                        System.out.println("Invalid Input!");
                        break;
                }
                System.out.print("Result: " + result);

                System.out.println();
                System.out.println();
            }
        }
    }
}