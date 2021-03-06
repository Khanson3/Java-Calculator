import java.util.Scanner;

public class Calculator {

    private double Addition(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    private double Subtraction(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    private double Multiplication(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    private double Division(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nWelcome to the Java-programmed calculator!\n" +
                "\nEnter your numbers with the following calculation format in mind: first number (+, -, *, or /) second number\n\n");
        System.out.print("Enter your first number: ");
        double firstNum = in.nextDouble();
        System.out.print("Enter your second number: ");
        double secondNum = in.nextDouble();
        Calculator calc = new Calculator();
        System.out.println("\nSelect the following operation you would like to perform indicated by the list of numbers:\n" +
                "\n1: Addition" +
                "\n2: Subtraction" +
                "\n3: Multiplication" +
                "\n4: Division\n");
        int opChoice = in.nextInt();
        double res = 0;
        char op = 'n';
        switch (opChoice) {
            case 1:
                res = calc.Addition(firstNum, secondNum);
                op = '+';
                break;
            case 2:
                res = calc.Subtraction(firstNum, secondNum);
                op = '-';
                break;
            case 3:
                res = calc.Multiplication(firstNum, secondNum);
                op = '*';
                break;
            case 4:
                res = calc.Division(firstNum, secondNum);
                op = '/';
                break;
            default:
                System.out.println("\nPlease select a valid operation number from the list. Restart the program and try again.");
                break;
        }
        System.out.printf("%n%f %c %f = %f", firstNum, op, secondNum, res);
        in.close();
    }
}