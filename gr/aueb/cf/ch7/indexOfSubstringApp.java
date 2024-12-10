package gr.aueb.cf.ch7;

public class indexOfSubstringApp {

    public static void main(String[] args) {
        String cf = "coding factory";

        int positionOfo = cf.indexOf("o");
        int positionOfSecondo = cf.indexOf("o", 2);
        int lastPositionOfo = cf.lastIndexOf("o");

        String cf2 = cf.substring(2, 10);
        String slice = cf.substring(1, 3);

        System.out.println(positionOfo);
        System.out.println(positionOfSecondo);
        System.out.println(lastPositionOfo);
        System.out.println(cf2);
        System.out.println(slice);
    }
}
