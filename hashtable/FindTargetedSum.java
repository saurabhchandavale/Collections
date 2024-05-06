package com.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTargetedSum {
	
	public int[] findSum(int arr[], int target) {
		int result[] = new int[2];
		Map map = new HashMap();
		for(int i = 0; i < arr.length; i++) {
			if(!map.containsKey(target-arr[i])) {
				map.put(arr[i], i);
			}else {
				result[1] = i;
				result[0] = (int) map.get(target - arr[i]);
				return result;
			}
		}
		
		return result;
	}
	
	public int[] twoSum(int arr[], int target) {
		Arrays.sort(arr);
		int result[] = new int[2];
		int low = 0;
		int high = arr.length - 1;
		while(low < high) {
			int sum = arr[low] + arr[high];
			if(target == sum) {
				result[0] =  low;
				result[1] = high;
				return result;
			}else if(sum < target) {
				low++;
			}else {
				high--;
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {
		FindTargetedSum f = new FindTargetedSum();
		int arr[] = {2,11,5,10,7,8};
		int[] findSum = f.findSum(arr, 9);
		for(int i : findSum)
		System.out.print(i + " ");
		System.out.println();
		int[] twoSum = f.twoSum(arr, 9);
		for(int i : twoSum)
		System.out.print(i + " ");

	}

}
