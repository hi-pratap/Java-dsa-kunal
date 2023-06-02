package hello.dsa.conditionAndLoop;

public class CalculatorProgram {

    public static void main(String[] args) {

        int sal=10000;

        if (sal>100000){
            System.out.println("say hello");
        }


        //For Loop
        for (int num=1;num <= 5 ; num+=1){
            System.out.println("Number : "+num);
        }

        // while Loop

        while (sal<=11111){
            System.out.print(sal+"\t");

            sal+=5;
        }
    }
}
