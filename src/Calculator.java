import java.io.OutputStream;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         System.out.println("First input");
         double x = scanner.nextDouble();

         System.out.println("Enter operator");
         String operator = scanner.next();

         System.out.println("Second input");
         double y = scanner.nextDouble();
         double result = 0;


       switch (operator){
           case "+" :
               result = sum(x, y);
              break;
           case "-":
              result = subtraction(x, y);
             break;
           case "*":
               result = multiplication(x, y);
               break;
           case "/":
               result = division(x, y);
               break;
           default:
               System.out.println("Unknown operator");

       }

        System.out.println(result);


     // Please have a look why if-elseif block not work
     /*
        if (operator == "+"){
            sum(x, y);
        }
        else if(operator == "-"){
            subtraction(x, y);
        }
        else if (operator == "*"){
            multiplication(x, y);
        }
        else if (operator == "/"){
           division(x, y);
        }
        else
            System.out.println("Unknown operator");

*/

    }


    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2){
        return num1 / num2;
    }
}
