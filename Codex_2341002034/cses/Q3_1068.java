//package io.subham.cses;
//Name-Subham Saswat Barick
//regd.no - 2341002034
//peoblem link- https://cses.fi/problemset/task/1068/
import java.util.Scanner;

public class Q3_1068 {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long n = sc.nextLong();

	        System.out.print(n + " "); // Print the first  number

	        while (n != 1) {
	            if (n % 2 == 0) {
	                n /= 2;
	            } else {
	                n = 3 * n + 1;
	            }
	            System.out.print(n + " "); 
	        }

	        sc.close();
	    }
}
//7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
//7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 