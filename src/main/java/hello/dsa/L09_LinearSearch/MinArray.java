package hello.dsa.L09_LinearSearch;

public class MinArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8  ,-7  };
        int min=array[0];
        for (int i = 0; i < array.length; i++)
            if (min > array[i]) min = array[i];
        System.out.println(min);
    }
}
