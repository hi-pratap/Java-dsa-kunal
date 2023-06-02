package hello.dsa.L09_LinearSearch;

public class SearchInRange {

    public static void main(String[] args) {
        int arr[]={1,3,2,3,4,5,6,7,9,7,00,23};
        int target=2;

        System.out.println(linearSearchInRange(arr, target,0, 4));
    }

  public  static int   linearSearchInRange(int arr[], int target, int start, int end  ){

      for (int i = start; i <=end ; i++) {
          int element = arr[i];

          if (element == target) {
              return element;
          }
      }
      return -1;
    }
}
