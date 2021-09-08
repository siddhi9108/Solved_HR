package javaapplication1;
//import java.util.*;

public class Practice2_Phrase_O_Matic {

    public static void main(String[] args) {
        String[] one = {"a", "b", "c", "d", "m"};
        String[] two = {"e", "f", "g", "h", "n", "o"};
        String[] three = {"i", "j", "k", "l"};

        int one1 = one.length;
        System.out.println(one1);
        int two2 = two.length;
        System.out.println(two2);
        int three3 = three.length;
        System.out.println(three3);

        int rand1 = (int) (Math.random() * one1);
        System.out.println(rand1);
        int rand2 = (int) (Math.random() * two2);
        System.out.println(rand2);
        int rand3 = (int) (Math.random() * three3);
        System.out.println(rand3);
        String phrase = one[rand1] + " " + two[rand2] + " " + three[rand3];

        System.out.println("What we need is a: " + phrase);
    }
}
