package hello.dsa.conditionAndLoop;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if (a > b && a > c) {
            System.out.println("Maximum Number: " + a);
        } else if (b>c && b>a) {
            System.out.println("Maximum Number: " + b);
        } else if (c>a && c>b) {
            System.out.println("Maximum Number: " + c);
        }

        int max = Math.max(Math.max(a, b), c);
        System.out.println("Maximum Number By Math Class: "+max);
    }
}
