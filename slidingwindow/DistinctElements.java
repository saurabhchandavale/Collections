package com.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctElements {
	
	public List<Integer> elements(int arr[], int k) {
		List<Integer> array = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length-k; i++) {
			int count = 0;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]!=arr[j]) {
					count++;
				}
				
				
			}
			array.add(count);
			
		}
		return array;
	}
	
	public void countDistinctElement(int arr[], int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < k ; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map.size());
		
		for(int i = k ; i < arr.length; i++) {
			if(map.get(arr[i-k])==1) {
				map.remove(arr[i-k]);
			}else {
				map.put(arr[i-k], map.get(arr[i-k])-1);
			}
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			System.out.println(map.size());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistinctElements d = new DistinctElements();
		int arr[] = {1,2,3,4,5,5};
		d.countDistinctElement(arr, 2);
		List<Integer> elements = d.elements(arr, 2);
		for(int i : elements) {
			System.out.println(i);
		}

	}

}
