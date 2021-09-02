package javaapplication1;

import java.util.*;

public class NewClass26_HR_Day10 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your binary number: ");
        int x = ob.nextInt();
        int[] binaryNum = new int[1000];
        int i = 0;
        int count = 0;
        int max = 0;
        while (x > 0) {
            binaryNum[i] = x % 2;
            x = x / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j] + " ");
        }
        for (int j = i - 1; j >= 0; j--) {
            if (binaryNum[i] == '1') {
                count++;
            } else {
                count = 0;
            }
            //System.out.println(count);
            if (count > max) {
                max = count;
                System.out.println(max);
            }
        }
        //System.out.println(max);
    }
}
