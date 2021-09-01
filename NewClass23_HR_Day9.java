package javaapplication1;

import java.util.*;
import static javaapplication1.Result.factorial;

class Result {

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

public class NewClass23_HR_Day9 {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = ob.nextInt();
        System.out.println("Your answer is: " + factorial(n));
    }
}
