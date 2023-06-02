package hello.dsa.conditionAndLoop;

public class FibonacciNumber {

    public static void main(String[] args) {

      /*  int num1=0;
        int num2=1;
        System.out.println(num1+" "+num2);
        int targetNum=7;


     for (int i=1; i<=targetNum; i+=1){

         int temp=num2;
         num2=num2+num1;
         num1=temp;

         System.out.println(num2);

     }

    }*/


        int n1=0;
        int n2=1;
        int temp, number=100;

        System.out.println(n1+" "+n2);

        for (int i = 0; i < number; i++) {
            temp=n2;
            n2=n2+n1;
            n1=temp;
            System.out.println(n2);
        }

    }
}
