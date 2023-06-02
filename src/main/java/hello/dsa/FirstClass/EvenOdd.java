package hello.dsa.FirstClass;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();

        if (num%2==0) {
            System.out.println("Number of Even Categorical");
        }else {
            System.out.println("Number of odd categorical");
        }

    }
}
