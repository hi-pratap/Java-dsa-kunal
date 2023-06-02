package hello.dsa.L09_LinearSearch;

public class Main {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        //Q. find 5 exists in the array or not?
        //start searching from the beginning ONE BY ONE of the array i.e. Linear search
        // -1 is Value doesn't exist in the array

        //Time Complixity :: best O(1)  // constant

        int i = linearSearch(array, 9898);
       // linearSearchReturnElement(array, 8);
        System.out.println(linearSearchReturnElement(array, 8));

    }

    //search in array if item found returns index

    public static int linearSearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }

        int index = 0;
        while (index < array.length) {

            int element = array[index];

            if (element == target) {
                return index;
            }

            index++;
        }
        // this line will execute hence target not found
        return -1;
    }


    // search target and return element

    public static int linearSearchReturnElement(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }

        for (int element : array) {

            if (element == target) {
                return element;
            }
        }
        // this line will execute hence element not found
        return -1;
    }


}
