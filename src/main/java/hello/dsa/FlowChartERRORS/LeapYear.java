package hello.dsa.FlowChartERRORS;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();

        //leap year formula please

        if (a%4==0 || a / 100 ==0 ) {

            System.out.println("leap year");
        }else {
            System.out.println("not leap year");
        }

    }
}
