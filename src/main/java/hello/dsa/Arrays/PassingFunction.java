package hello.dsa.Arrays;

import java.util.Arrays;

public class PassingFunction {


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};

        change(a);
        System.out.println(Arrays.toString(a));
    }

    private static void change(int[] a) {

        a[0] = 99;
    }
}
