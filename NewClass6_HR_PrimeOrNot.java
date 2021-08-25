package javaapplication1;
import java.util.*;
public class NewClass6_HR_PrimeOrNot {
    public static void main(String[] args) {
        int x;
        Scanner ob = new Scanner(System.in);
        x=ob.nextInt();
        if (isPrime(x)) {  
           System.out.println(x + " is a prime number");  
       } else {  
           System.out.println(x + " is not a prime number");  
       }  
    }

    private static boolean isPrime(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
