package com.array;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,m,p;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = s.nextInt();
		System.out.println("Enter array Elements");
		int a[] = new int[n];
		int b[] = new int[n+1];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		
		System.out.println("Enter the index of element want to insert");
		m = s.nextInt();
		System.out.println("Enter number want to insert");
		p = s.nextInt();
		
		for(int i = 0; i < n+1; i++) {
			if(i < m) {
				b[i] = a[i];
			}else if(i == m) {
				b[i] = p;
			}else {
				b[i] = a[i-1];
			}
		}
		
		for(int x : b) {
			System.out.println(x);
		}

	}

}
