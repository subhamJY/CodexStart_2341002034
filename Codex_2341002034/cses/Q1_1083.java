//Name-Subham Saswat Barick
//regd.no - 2341002034
//peoblem link- https://cses.fi/problemset/task/1083/
package io.subham.cses;

import java.util.Scanner;

public class Q1_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        long n = sc.nextLong();

        long totalSum = n * (n + 1) / 2;

        long sum = 0;
        for (long i = 0; i < n - 1; i++) {
            long num = sc.nextLong();
            sum += num;
        }

        long output = totalSum - sum;
        System.out.println(output);
    }
}

