import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("Hello world");

        CalculatorApp a1 = new CalculatorApp();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Choose an option : (*,+,-,%,/)");
            System.out.print("->");
            String input = sc.next();
            char ch = input.charAt(0);

            if (input.length() != 1) {
                System.out.println("Enter valid information !");
            } else {
                a1.Calculate(ch);
            }

            boolean exit = a1.exitProgram();


            if (exit) {
                break;
            }


        } while (true);

        System.out.println("Thank You !");


    }

    public boolean exitProgram() {
        int times = 0;
        int retry = 5;
        for (times = 0; times < retry; times++) {
            System.out.println("Do you want to continue ? (y/n)");
            Scanner sc = new Scanner(System.in);
            String exitInput = sc.next();
            char ch1 = exitInput.charAt(0);
            if (exitInput.length() == 1 && ch1 == 'n' || ch1 == 'N') {
                return true;


            } else if (exitInput.length() == 1 && ch1 == 'y' || ch1 == 'Y') {
                return false;

            } else {
                System.out.println("enter valid ! ");
            }
        }
        if (times >= retry) {
            System.out.println("Maximum retry count exceeded ! exiting forcefully");
            return true;
        }
        return true;
    }

    public int getInteger() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        return num1;
    }

    public void Calculate(char ch) {
        switch (ch) {
            case '+':
                System.out.println("Enter 2 Numbers");
                int num1 = getInteger();
                int num2 = getInteger();
                System.out.println("Addition Result => " + (num1 + num2));
                break;
            case '-':
                System.out.println("Enter 2 Numbers");
                int num3 = getInteger();
                int num4 = getInteger();
                System.out.println("Subtraction Result => " + (num3 - num4));
                break;
            case '*':
                System.out.println("Enter 2 Numbers");
                int num5 = getInteger();
                int num6 = getInteger();
                System.out.println("Multiply Result => " + (num5 * num6));
                break;
            case '/':
                System.out.println("Enter 2 Numbers");
                double num7 = getInteger();
                double num8 = getInteger();
                if (num8 == 0) {
                    System.out.println("Cannot divide by 0");
                    return;
                }
                System.out.println("division result => " + (num7 / num8));
                break;
            case '%':
                System.out.println("Enter 2 Numbers");
                int num9 = getInteger();
                int num10 = getInteger();
                if (num10 == 0) {
                    System.out.println("Cannot divide by 0");
                }
                System.out.println("modulo result => " + (num9 % num10));
                break;
            default:
                System.out.println("choose any one");
                break;
        }

    }
}
