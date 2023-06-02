package hello.dsa.conditionAndLoop;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;

        while (true) {

            System.out.print("Please Enter Operation : ");
            char op = scanner.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {

                System.out.print("Please Enter First Number Here : ");

                int a = scanner.nextInt();
                System.out.print("Please Enter Second Number Here : ");
                int b = scanner.nextInt();

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '%') {
                    ans = a % b;
                }
                if (op == '/') {
                    ans = a / b;
                }

                System.out.println("ANS IS : "+ans);

            } else if (op == 'x' || op == 'X') {
                break;

            }else
            {
                System.out.println("Invalid");
            }

        }


    }
}
