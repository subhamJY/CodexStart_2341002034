//package io.subham.cses;
//Name-Subham Saswat Barick
//regd.no - 2341002034
//problem link- https://cses.fi/problemset/task/1069/

import java.util.Scanner;

public class Q4_1069 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String string=sc.next();
	int currentLong=1;
	int longest=1;
	for(int i=1;i<string.length();i++) {
		if(string.charAt(i)==string.charAt(i-1)) {
			currentLong++;
		}else {
			if (currentLong>longest) {
				longest=currentLong;
			}
			currentLong=1;
		}
	}
	if (currentLong>longest) {
		longest=currentLong;
	}
	System.out.println(longest);
}
}
