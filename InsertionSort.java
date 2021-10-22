package com.example;

import java.util.Scanner;
public class InsertionSort {
    public static void Sort(int arr[]) {
        int swap=0,comparison=0;
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            comparison++;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                swap++;
            }
            arr[j + 1] = key;
        }
        System.out.println("Swpping: "+swap+"\nComparison: " +comparison);
    }

    public static void main(String args[]) {
        int n, i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements you want to sort: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " elements ");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Number of element is : " + m);
        long starttime = System.nanoTime();
        Sort(a);
        long endtime =System.nanoTime();
        long passTime = endtime - starttime;
        long tr= passTime/1000;
        System.out.println("Time is "+ tr + " in Microsecond\n\n");
        System.out.println("\nSorted elements are: ");
        for (int num = 0; num < a.length; num++) {
            System.out.print(a[num] + " ");
        }
        }
    }
}
