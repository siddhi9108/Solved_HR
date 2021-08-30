package javaapplication1;

import java.util.*;

public class NewClass18_HR_Day6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        in.nextLine();

        for (int i = 0; i < N; i++) {
            String string = in.nextLine();
            char[] charArray = string.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        }

        in.close();
        //Scanner ob = new Scanner(System.in);
        //System.out.println("How many string you want: ");
        //int x = ob.nextInt();
        //System.out.println("Enter your String: ");
        //String arr[] = new String[x];
        //int first = 0;
        //int last = x - 1;
        //for (int i = 0; i < x; i++) {
        //  arr[i] = ob.next();
        //String s = ob.next();
        //char[] charArray = s.toCharArray();
        //for (int j = 0; j < charArray.length; j++) {
        //if (j % 2 == 0) {
        //  System.out.print(charArray[j]);
        //}
        //}
        //System.out.print(" ");
        //for (int j = 0; j < charArray.length; j++) {
        //  if (j % 2 != 0) {
        //    System.out.println(charArray[j]);
        //}
        //}
        //System.out.println();
        //}
        //ob.close();
    }
}
