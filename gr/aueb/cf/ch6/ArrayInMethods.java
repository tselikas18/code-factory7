package gr.aueb.cf.ch6;

public class ArrayInMethods {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for (int el : arr){
            System.out.println(el);
        }
    }
   //Overloaded version print array, prints from low to high

    public static void  printArray(int[] arr, int low, int high){
        if (low < 0 || high >arr.length - 1){
            return;
        }

        for (int i = low; i <= high; i++){
            System.out.println(arr[i]);
        }
    }
}
