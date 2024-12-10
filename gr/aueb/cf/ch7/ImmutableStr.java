package gr.aueb.cf.ch7;

import com.sun.management.GarbageCollectionNotificationInfo;

public class ImmutableStr {

    public static void main(String[] args) {

        String s1 = "coding";
        String s2 = "coding";

        s2 = "factory";
        s1 = "athens";

        System.out.println(s1);
        System.out.println(s2);
    }
}
