package hello.dsa.L10_BinearySearch;

public class BinarySearch {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 11, 23, 45, 76, 89};
        int target = 9;

        getBinarySearch(arr, target);

    }

    //return index
//return -1 if it does not exists


    private static int getBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find middle element
            //   int middle = (start + end) / 2; //starte + end may exceed integer capacity

            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }
            if (target < arr[middle]) {
                 end = middle - 1;
            }
            if (target > arr[middle]) {
                 start = middle + 1;
            }


        }

        return -1;
    }
}
