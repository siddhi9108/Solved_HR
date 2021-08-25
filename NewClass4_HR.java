package javaapplication1;

import java.util.*;

public class NewClass4_HR {

    public static void main(String[] args) {
        String s;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your string: ");
        s = ob.nextLine();
        String[] st = (s.replaceAll("^[\\W+\\s+]", "").split("[\\s!,?._'@]+"));
        System.out.println(st.length);
        for (String str : st) {
            System.out.println(str);
        }
    }

}
