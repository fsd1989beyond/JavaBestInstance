package edu.nwu.Chapter02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Properties;

public class JavaRunEnv {


    public static void main(String[] args) {
        System.out.println("System.getenv(\"PATH\") = "+System.getenv("PATH"));
        System.out.println("System properties");
        Properties p = System.getProperties();
        p.list(System.out);



        String sh ="ABCDEFGHIJKLMN";
        System.out.println(new StringBuilder(sh).reverse());
    }
}

