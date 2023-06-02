package hello.dsa.L09_LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target =8;

        for (int row = 0; row < array.length; row++) {

            for (int col = 0; col < array[row].length; col++) {

                if(array[row][col]==target) {
                    System.out.println(Arrays.toString(new int[]{row,   col}));
                }

            }

        }
    }
}
