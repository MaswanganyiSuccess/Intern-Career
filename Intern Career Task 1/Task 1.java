import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result;
        char operator;
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.print("Enter first number: ");
            number1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            number2 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /) or 'q' to quit: ");
            operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (number2 != 0) {
                        result = number1 / number2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                case 'q':
                    keepRunning = false;
                    System.out.println("Calculator shutting down.");
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, / or 'q' to quit.");
                    break;
            }
        }

        scanner.close();
    }
}
