package com.company;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int [] arr = new int [102];
        for(int i =0;i<arr.length;i++){
            arr[i+1] = arr[i] + 1;
           // System.out.println(arr[i]);
            if (arr[i]%5 == 0){
                System.out.print(arr[i] + "\t");
            }
        }
        System.out.println();
    }
}
