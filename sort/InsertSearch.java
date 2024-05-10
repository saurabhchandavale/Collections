package com.search;

public class InsertSearch {
	
	public int insertSearch(int arr[],int target) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid =  low  + (high-low)/2;
			if(arr[mid]==target) return mid;
			if(arr[mid] > target) high = mid - 1;
			if(target > arr[mid]) low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args) {
		//In this array if we insert 6 it must be comes after 5 and at index 5
		int arr[] = {1,2,3,4,5,8,10,12};

		InsertSearch i = new InsertSearch();
		int insertSearch = i.insertSearch(arr,6);
		System.out.println(insertSearch);
	}

}
