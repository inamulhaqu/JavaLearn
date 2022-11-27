package com.company.Array;

import java.util.Scanner;

public class ArraySize {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter elements of array:");
        for (int i=0; i<a.length; i++){
            a[i]= r.nextInt();
        }
        System.out.print("Elements of array:");
        for (int i=0; i<a.length; i++){
            a[i]= r.nextInt();
            System.out.println(a[i]+" ");
        }
        System.out.print("\nArray Length"+ a.length);
    }
}
