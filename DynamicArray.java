package com.company.Array;
// In Dunamic array we can select or change the size of array at runtime
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        int size,i;
        Scanner r=new Scanner(System.in);                   //Creating object of size variable to take input from user
        System.out.println("Enter the size of array:");
        size=r.nextInt();                                   //next int method is used to read the input values
        int a[]=new int[size];
        for (i=0;i<size; i++){           //Storing the values in an array
            a[i]=r.nextInt();
        }
        System.out.println("Elements of array are below:");
        for (i=0; i<size; i++){        //Printing the array elements
            System.out.println(a[i]+" ");
        }
    }
}
