package hello.dsa.caseswitch;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String dep = sc.next();

        switch (empId) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> {
                System.out.println("3");
                switch (dep) {
                    case "IT" -> System.out.println("IT");
                    case "teacher" -> System.out.println("teacher");
                    case "PM" -> System.out.println("PM");
                }
            }
            default -> System.out.println("none");
        }


    }
}
