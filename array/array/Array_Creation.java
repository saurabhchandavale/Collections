package com.array;

import java.util.Scanner;

public class Array_Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = s.nextInt();
		System.out.println("Enter array Elements");
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		
		for(int x : a) {
			System.out.println(x);
		}

	}

}
