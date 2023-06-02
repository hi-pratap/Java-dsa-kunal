package hello.dsa.FirstClass;

import java.util.Locale;
import java.util.Scanner;

public class SayHello {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Please enter name");
        String name=scanner.next();
        greatings(name);
    }

    private static void greatings(String name) {

        System.out.println("Hello, " + name.toUpperCase(Locale.ROOT) + " Have a great day!");
    }
}
