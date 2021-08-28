package javaapplication1;

import java.util.*;

public class Practice1_SumOfArray {

    public static void main(String[] args) {
        int x;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter how many elements you want: ");
        x = ob.nextInt();
        System.out.println("Enter your elements: ");
        int arr[] = new int[x];
        //x=ob.nextInt();
        int sum = 0;
        for(int i=0;i<x;i++)
        {
           arr[i]=ob.nextInt();
           sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}
