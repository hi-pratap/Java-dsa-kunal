package hello.dsa.conditionAndLoop;

public class CountNumbers {


    public static void main(String[] args) {

        int n=1211221;
        int count=0;

        while(n>0){

            int rem=n%10;

            if(rem==1){
                count++;
            }

           n= n/10;
        }

        System.out.println("Count: "+count);
    }
}
