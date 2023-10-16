package io.subham.cses;

import java.util.Scanner;

public class permutations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("1");
            return;
        }

        if (n < 4) {
            System.out.println("NO SOLUTION");
            return;
        }


        
        int[] permutation = new int[n];

        // Fill even indices with even numbers
        for (int i = 0, num = 2; i < n; i += 2, num += 2) {
            permutation[i] = num;
        }

        // Fill odd indices with odd numbers
        for (int i = 1, num = 1; i < n; i += 2, num += 2) {
            permutation[i] = num;
        }

        // Print the permutation
        for (int i = 0; i < n; i++) {
            System.out.print(permutation[i] + " ");
        }

        System.out.println();
	}
}
