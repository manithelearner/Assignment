import java.util.Scanner;
public class ArithExp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numerator: ");
        int numerator = sc.nextInt();
        System.out.println("Enter Denominator: ");
        int denominator = sc.nextInt();
        try {
            divideNumbers(numerator, denominator);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        int result = numerator / denominator;
        System.out.println("Result of division: " + result);
}
}




