package hello.dsa.L09_LinearSearch;



public class EvenDigits {


    public static void main(String[] args) {

        int[] digits ={12,345,2,6,7896};

        System.out.println(findNumbers(digits));
      System.out.println(digits2(-1232));
    }

    private static int findNumbers(int[] digits) {
        int count = 0;
        for (int number : digits) {
            if (checkEven(number)) {
                System.out.println("digits are even");
                count++;
            }
        }
        return count;
    }

    public static boolean checkEven(int number){
        int numberOfdigits = digits(number);

        /*if(numberofdigits%2==0) {
            return true;
        }
        return false;*/
        return numberOfdigits % 2 == 0;
    }

    public void sayHelloToGithub(String name){
        System.out.println("Hello to Github");
    }
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
            System.out.println("");
        }
        return (int)(Math.log10(num)) + 1;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }
}
