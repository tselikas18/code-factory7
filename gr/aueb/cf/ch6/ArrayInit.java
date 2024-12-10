package gr.aueb.cf.ch6;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[10]; //declare and initialization
        int[] arr2 = {1, 2, 3, 4, 5}; //unsized declare
        int[] arr3 = new int[] {1, 2, 3, 4}; //array initializer

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //enhanced for
        for (int el : arr3){
            System.out.println(el);
        }
    }
}
