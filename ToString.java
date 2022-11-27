package com.company.Array;

import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        int arr[][]= {{10,20,30,40,50,60}};                    //2D array
        int ar[]= {60,50,40,30,20,10};                         //1D array
        System.out.println("toSting= "+Arrays.toString(ar));               //toString method entire array elements with semicolon
        System.out.println("asList"+Arrays.asList(ar));                 //asList method prints the reference
        System.out.println("deepToString"+Arrays.deepToString(arr));          //deepToString method works only for 2D array
    }
}
