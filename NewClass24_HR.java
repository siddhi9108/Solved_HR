package javaapplication1;

import java.util.*;

public class NewClass24_HR {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter: ");
        int x = ob.nextInt();
        List<Integer> l = new ArrayList<Integer>();
        System.out.println("Enter: ");
        for (int i = 0; i < x; i++) {
            l.add(ob.nextInt());
        }
        System.out.println("Enter: ");
        int a = ob.nextInt();
        System.out.println("Enter: ");
        for (int i = 0; i < a; i++) {
            String b = ob.next();
            if (b.equalsIgnoreCase("INSERT")) {
                int index = ob.nextInt();
                int item = ob.nextInt();
                l.add(index, item);
            } else {
                l.remove(ob.nextInt());
            }
        }
        for (Integer integer : l) {
            System.out.print(integer + " ");
        }
    }
}
