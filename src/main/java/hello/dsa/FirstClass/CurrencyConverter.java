package hello.dsa.FirstClass;

import java.util.Scanner;

public class CurrencyConverter {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a=scanner.nextDouble(); //

        convert(a);
    }

    private static void convert(double a) {

        System.out.println("You will Get: "+a/84+" $");
    }
}
