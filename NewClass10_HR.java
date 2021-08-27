package javaapplication1;

import java.math.BigInteger;
import java.util.*;

public class NewClass10_HR {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a:");
        BigInteger a = new BigInteger(ob.next());
        System.out.println("Enter b:");
        BigInteger b = new BigInteger(ob.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
