package hello.dsa.FlowChartERRORS;

import java.util.Scanner;

public class MultiplicationERROR {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int a=scanner.nextInt();

        for (int i = 1; i <=10; i++) { //2

            for (int j = i+1; j <=10; j++) {

                System.out.println(i*j+" ");

            }
        }
    }
}
