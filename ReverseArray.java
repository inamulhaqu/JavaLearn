package com.company.Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the elements");
        for (int i=0; i<arr.length; i++){
            arr[i]=r.nextInt();
        }
        System.out.println("Array elements");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nReverse elements");
        for (int i=arr.length-1; i>=0; i--){
            //arr[i]=r.nextInt();
            System.out.print(arr[i]+" ");
        }
    }
}
