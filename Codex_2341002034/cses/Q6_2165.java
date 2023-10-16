//package io.subham.cses;
package io;

import java.util.Scanner;

public class Q6_2165 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        int totalMoves = (int) Math.pow(2, n) - 1;
	        System.out.println(totalMoves);

	        moveDisks(n, 1, 3, 2);
	        scanner.close();
	    }

	    private static void moveDisks(int n, int source, int destination, int auxiliary) {
	        if (n == 1) {
	            System.out.println(source + " " + destination);
	            return;
	        }

	        moveDisks(n - 1, source, auxiliary, destination);
	        System.out.println(source + " " + destination);
	        moveDisks(n - 1, auxiliary, destination, source);
	}
}
