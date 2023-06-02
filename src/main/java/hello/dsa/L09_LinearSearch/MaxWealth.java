package hello.dsa.L09_LinearSearch;

public class MaxWealth {

    public static void main(String[] args) {

        int array[][] = {{1, 2, 3, 4, 5, 6, 7, 8},
                {
                        1, 2, 3, 4, 5, 6, 7, 8
                },
                {
                        1, 2, 3, 4, 5, 6, 7}};

        maxWealth(array);
    }

    private static void maxWealth(int[][] array) {
        int oo = Integer.MIN_VALUE;
        for (int[] ints : array) {
            int sum = 0;
            for (int anInt : ints) sum += anInt;
            if (sum > oo) oo = sum;
        }
        System.out.println(oo);
    }
}
