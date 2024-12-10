package gr.aueb.cf.ch6;

public class ArrayReferenceCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrRefCopy = arr;

        for (int el : arrRefCopy){
            System.out.println(el);
        }

        arrRefCopy[4] = 100;

        for (int el : arr) {
            System.out.println(el);
        }
    }
}
