package gr.aueb.cf.ch10;

public class UpperLowerCaseApp {
    public static void main(String[] args) {
        String message = "Athens";
        StringBuilder sb = new StringBuilder();
        String subStr;
        String s;

        for (int i = 0; i < message.length(); i++){
            subStr = message.substring(i, i + 1);
            s = (i % 2 == 0)? subStr.toLowerCase() : subStr.toUpperCase();
            sb.append(s);
        }

        System.out.println(sb);
    }

}
