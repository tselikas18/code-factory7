package gr.aueb.cf.ch6;

public class ArraySearchWithMethod {
    public static void main(String[] args) {

    }

    public static int getPosition(int[] arr, int value){
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
