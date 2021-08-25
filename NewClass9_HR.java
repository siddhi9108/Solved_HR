package javaapplication1;

import java.util.Scanner;

public class NewClass9_HR {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        //System.out.println("Enter ur array");
        int x = ob.nextInt();
        int arr[] = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = ob.nextInt();
        }
        int count = 0;
        for (int i = 0; i < x; i++) {
            int sum = arr[i];
            if (sum < 0) {
                count++;
                //System.out.println(count);
            }
            for (int j = i + 1; j < x && i + 1 < x; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                    //System.out.println(count);
                }
            }
        }
        System.out.println(count);
    }

}
