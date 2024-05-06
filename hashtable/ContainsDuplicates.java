package com.hashtable;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
	
	public boolean containsDuplicates(int arr[]) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < arr.length; i++)
		{
			if(set.contains(arr[i])) {
				return true;
			}
			set.add(arr[i]);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsDuplicates c = new ContainsDuplicates();
		int arr[] = {1,0,2,3,5};
		boolean containsDuplicates = c.containsDuplicates(arr);
		System.out.println(containsDuplicates);
	}

}
