package com.array;

import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,m;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = s.nextInt();
		System.out.println("Enter array Elements");
		int a[] = new int[n];
		int b[] = new int[n-1];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Enter index of array want to delete");
		m=s.nextInt();
		
		for(int i = 0; i < n;i++) {
			if(i < m) {
				b[i] = a[i];
			}else if(i == m) {
				continue;
			}else {
				b[i-1] = a[i];
			}
		}
		
		for(int x : b) {
			System.out.println(x);
		}

	}

}