package gr.aueb.cf.ch7;

public class StrEquals {

    public static void main(String[] args) {

        String s1 = "athens";
        String s2 = "athens";
        String s3 = "Athens";

        boolean equal1 = s1.equals(s2);
        boolean equal2 = s1.equals(s3);
        boolean equal3 = s1.equalsIgnoreCase(s3);

        boolean equal4 = s1.toLowerCase().equals(s3.toLowerCase());
    }
}
