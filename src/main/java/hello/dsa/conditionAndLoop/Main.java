package hello.dsa.conditionAndLoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temp in C :");
        Float tempC = sc.nextFloat();

        Float tempF=(tempC * 9/5)+32;

        System.out.println("Temperature in Float : "+tempF);



    }
}