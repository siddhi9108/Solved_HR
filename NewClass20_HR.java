package javaapplication1;

import java.util.*;

public class NewClass20_HR {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the elements");
        int n = ob.nextInt();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = ob.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(ob.nextInt());
            }
            rows.add(row);
            int a = ob.nextInt();
            System.out.println("Enter: ");
            for (i = 0; i < a; i++) {
                int x = ob.nextInt();
                int y = ob.nextInt();
                try {

                    System.out.println(rows.get(x - 1).get(y - 1));

                } catch (IndexOutOfBoundsException e) {

                    System.out.println("ERROR!");

                }
            }
        }
    }
}
