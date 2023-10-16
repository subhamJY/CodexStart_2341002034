//package io.subham.cses;
//Name-Subham Saswat Barick
//regd.no - 2341002034
//peoblem link- https://cses.fi/problemset/task/1094/

import java.util.Scanner;

public class Q5_1094 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of elements in the array
        long[] arr = new long[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long operations = 0; 
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                operations += arr[i - 1] - arr[i];
                arr[i] = arr[i - 1]; // Update the current element
            }
        }
        System.out.println(operations);

	}
}
