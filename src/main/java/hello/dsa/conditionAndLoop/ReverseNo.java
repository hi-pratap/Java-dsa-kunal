package hello.dsa.conditionAndLoop;

public class ReverseNo {

    public static void main(String[] args) {

        int number = 12345;

        int ans = 0;
        for (int i = 0; i <= number; i++) {
            int rem = number % 10; // 5
            number = number / 10;
           // rem = rem * 10 + rem;

            ans = ans * 10 + rem;

        }

        System.out.println(ans);
    }
}
