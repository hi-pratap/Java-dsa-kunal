package hello.dsa.Arrays;

public class Max {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(maxRange(array, 1, 3));
        System.out.println(max(array));
    }

    private static int maxRange(int[] array, int start, int end) {

        if(start>end){
            return -1;
        }

        if(array==null){
            return -1;
        }

        int maxVal =array[start];

        for (int i = start; i <= end; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }

        return maxVal;
    }


    public static int max(int[] array){
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i]>maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

}
