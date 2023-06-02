package hello.dsa.Arrays;

import java.util.Arrays;

public class SwapAndReverse {

    public static void main(String[] args) {

        int array[] ={1,2,3,4,5,6,7,8};

    //    swap(array,0,4);

        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array) {

        int start = 0;
        int end = array.length - 1;

        while (start < end){
            swap(array,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp=array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
}
