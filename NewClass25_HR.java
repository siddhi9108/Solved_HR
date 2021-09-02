package javaapplication1;

import java.util.*;

public class NewClass25_HR {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int min, max;
        int x = ob.nextInt();
        int arr[] = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Enter the element" + (i + 1) + ":");
            arr[i] = ob.nextInt();
        }
        min = arr[0];
        max = arr[0];
        for (int i = 0; i < x; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
