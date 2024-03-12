import java.util.Scanner;
class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}
class NumberValidator {
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }
}


public class customvalid {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        try {
            NumberValidator.validateNumber(number);
            System.out.println("Number is valid: " + number);
        } catch (CustomValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
