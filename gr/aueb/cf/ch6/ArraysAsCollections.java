package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {

    }
//filtering
    public static int[] getEvens(int[]  arr){
        int count = 0;

        for (int el : arr){
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        int pivot = 0;
        for (int el : arr){
            if (el % 2 == 0) evens[pivot++] = el;
        }
        return evens;
    }
//mapping
    public static int[] mapToDouble(int[] arr){
        int[] arrDouble = new int[arr.length];

        for (int i = 0; i < arr.length; i ++){
            arrDouble[i] = arr[i] * 2;
        }
//        for (int el : arr){
//            arrDouble[el] = arr[el] * 2;
//        }
        return arrDouble;
    }

    //reducing
    public static int sum (int[] arr){
        int sum = 0;

//        for (int i = 0; i < arr.length; i ++){
//            sum += arr[i];
        for (int el : arr){
            sum += el;
        }
        return sum;
    }

    public static double avg(int[] arr){
        return (double) sum(arr) / arr.length;
    }

    public static boolean anyEven(int[] arr){
        boolean isEven = false;
        for (int el : arr){
            if (el % 2 == 0){
                isEven = true;
                break;
            }
        }
        return isEven;
    }

    public static boolean moreThanTwoEvens(int[] arr){
        return getEvens(arr).length > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr){
        boolean isConsecutive = false;

        for (int i = 0; i < arr.length - 2;){
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i+2] -2){
                isConsecutive = true;
                break;
            }
        }
        return isConsecutive;
    }

    public static boolean moreThanTwoIsWithSameEnding(int[] arr){
        boolean isTrue = false;

        for (int i = 0; i < arr.length - 2;){
            if ((arr[i] % 10) == (arr[i + 1] % 10) && (arr[i] % 10) == (arr[i + 2] % 10)){
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }
    public static boolean AllAreEven(int[] arr){
//        return getEvens(arr).length == arr.length;

        int count = 0;

        for (int el : arr){
            if (el % 2 == 0) count++;
        }
        return count == arr.length;

    }
}
