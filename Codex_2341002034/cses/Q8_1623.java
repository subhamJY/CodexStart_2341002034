//package io.subham.cses;
package io;

import java.util.Scanner;

public class Q8_1623 {

 public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();  // number of apples
	    int[] weights = new int[n];  // weights of apples

	    for (int i = 0; i < n; i++) {
	        weights[i] = scanner.nextInt();
	    }

	    long minDifference = findMinWeightDifference(weights, 0, 0, 0);
	    System.out.println(minDifference);
	    scanner.close();
	}

	private static long findMinWeightDifference(int[] weights, int index, long sum1, long sum2) {
	    if (index == weights.length) {
	        return Math.abs(sum1 - sum2);
	    }

	    long diff1 = findMinWeightDifference(weights, index + 1, sum1 + weights[index], sum2);

	    long diff2 = findMinWeightDifference(weights, index + 1, sum1, sum2 + weights[index]);

	    return Math.min(diff1, diff2);
	}
}

