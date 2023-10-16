//package io.subham.cses;
//Name-Subham Saswat Barick
//regd.no - 2341002034
//peoblem link- https://cses.fi/problemset/task/1617/

import java.util.Scanner;

public class Q2_1617 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		long mod=1000000007;
		long result=1;
		for (int i=0;i<n;i++) {
	
			long res=(result*2)%mod;
			//System.out.println(res);
			result=res;
		}
		
		System.out.println(result);
	}
}
