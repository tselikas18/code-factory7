package gr.aueb.cf.ch5;

public class PowerAppRecursive {

    public static void main(String[] args) {
        for (int i = 1, j = 1; i <= 10; i++, j++){
            System.out.println(power(i, j));
        }
    }
    public static int power(int a, int n){
        return (n == 0) ? 1 : power(a, n - 1) * n;
    }
}
