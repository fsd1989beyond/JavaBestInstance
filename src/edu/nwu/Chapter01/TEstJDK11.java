package edu.nwu.Chapter01;

import org.jetbrains.annotations.NotNull;

import java.util.Properties;

public class TEstJDK11 {


    @NotNull
    public static String getDevNull() {
        String sys = System.getProperty("os.name");
        System.out.println(sys);
        if (sys == null || sys.indexOf("Mac") >= 0) {
            return "Mac";
        }
        if (sys.startsWith("Windows")) {
            return "Windows";
        }
        return "/dev/null";

    }


    public static void main(String[] args) {
        System.out.println("System Properties");
        Properties p = System.getProperties();
//        p.list(System.out);

        System.out.println("OS type:" + getDevNull());

        try {
            Class.forName("java.lang.reflect.Constructor");

        } catch (ClassNotFoundException e) {
            String failure = "Sorry, nedd JDK 1.1 or later";
            System.err.println(failure);
            throw new IllegalArgumentException(failure);

        }

        System.out.println("Happy!");
    }
}
