package io.subham.cses;
import java.util.HashMap;
import java.util.Scanner;

public class sumValues {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(); // Number of elements in the array
	        int x = sc.nextInt(); // Target sum

	        HashMap<Integer, Integer> hm = new HashMap<>();
	        int[] array = new int[n];

	        for (int i = 0; i < n; i++) {
	            array[i] = sc.nextInt();

	            int ans = x - array[i];
	            if (hm.containsKey(ans)) {
	                int index = hm.get(ans);
	                System.out.println((index + 1) + " " + (i + 1)); 
	                return;
	            }

	            hm.put(array[i], i);
		}
		System.out.println("IMPOSSIBLE");
	}
}
