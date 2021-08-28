package javaapplication1;

import java.util.*;

public class NewClass15_HR_SalesByMatch {

    public static void main(String[] args) {
        int n;
        //int ar;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter how many elements u want: ");
        n = ob.nextInt();
        System.out.println("Enter the elements: ");
        int ar[] = new int[n];
        //int count = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = ob.nextInt();
            ar[i]++;

        }
        int count = 0;
        for (int p : ar) {
            count += p / 2;
        }
        System.out.println(count);

    }

}
