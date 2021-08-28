package javaapplication1;

import java.util.*;

public class NewClass16_HR_Day3 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter x");
        int x = ob.nextInt();
        if (x % 2 != 0) {
            System.out.println("Weird");
        } else if (x % 2 == 0 && x >= 2 && x <= 5) {
            System.out.println("Not Weird");
        } else if (x % 2 == 0 && x >= 6 && x <= 20) {
            System.out.println("Weird");
        } else if (x % 2 == 0 && x > 20) {
            System.out.println("Not Weird");
        }
    }
}
