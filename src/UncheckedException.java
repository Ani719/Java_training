import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number");
        int x = scanner.nextInt();
        System.out.println("operator");
        String str = scanner.next();
        System.out.println("second number");
        int y = scanner.nextInt();
        int result = 0;

        try {
            result = divide(x, y);
        }
        catch (ArithmeticException e){
            System.out.println("0 division error");
        }
        System.out.println(result);
    }

    public static int divide(int x, int y){
        return x/y;
    }
}