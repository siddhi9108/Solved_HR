package javaapplication1;

import java.util.*;

public class NewClass19_HR_Day7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        for (int i = n - 1; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
