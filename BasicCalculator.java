import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Basic Calculator ===");

        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        
        System.out.print("Choose operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }

        scanner.close();
    }
}