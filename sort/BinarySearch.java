package com.search;

public class BinarySearch {
	
	public int search(int arr[],int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) return arr[mid];
			if(key<arr[mid]) {
				high = mid - 1;
			}else {
				low = mid +1;
			}
			
		} 
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch b = new BinarySearch();
		int arr[] = {1,2,3,4,5,8,10,12};
		int result = b.search(arr, 12);
		System.out.println(result);
		

	}

}
