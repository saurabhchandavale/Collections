package com.slidingwindow;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribution {
	
	public int findminiumDiff(ArrayList<Integer> a, int n, int m) {
		Collections.sort(a);
		int res = Integer.MAX_VALUE;
		for(int i = 0; i < n-m+1;i++) {
			int minValue = a.get(i);
			int maxValue = a.get(i+m-1);
			res = Math.min(res, maxValue-minValue);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(15);
		a.add(10);
		a.add(11);

		a.add(12);
		a.add(55);
		a.add(7);
		a.add(15);
		ChocolateDistribution c = new ChocolateDistribution();
		int findminiumDiff = c.findminiumDiff(a, a.size(), 4);
		System.out.println(findminiumDiff);


	}

}
