package javaapplication1;

import java.util.*;

public class NewClass17_HR_Day4 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = ob.nextInt();
        for (int i = 1; i <= 10; i++) {
            int product = x * i;
            System.out.println(x + "x" + i + "=" + product);
        }
    }
}
