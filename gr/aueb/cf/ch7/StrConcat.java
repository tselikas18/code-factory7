package gr.aueb.cf.ch7;

public class StrConcat {

    public static void main(String[] args) {

        String s1 = "coding";
        String s2 = "factory";

        String s3 = s1 + s2;
        String s4 = s1.concat(s2);
        String s5 = s1 + " " + s2;
        String s6 = s1.concat(" ").concat(s2);

    }
}
