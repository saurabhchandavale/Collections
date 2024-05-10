package com.search;

public class DutchNationalFlag {
	
	public void sort(int arr[]) {
		int i = 0;
		int j = 0;
		int k = arr.length-1;
		
		while(i<=k) {
			if(arr[i] == 0) {
				swap(arr,i,j);
				i++;
				j++;
			}else if(arr[i] ==1 ) {
				i++;
			}else if(arr[i] ==2) {
				swap(arr,i,k);
				k--;
			}
		}
		
	}
	
	public void swap(int arr[], int i, int k) {
		int temp = arr[i];
		arr[i] = arr[k];
		arr[k] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DutchNationalFlag d = new DutchNationalFlag();
		int arr[] = {0,1,0,1,2,0,2};
		d.sort(arr);
		for(int a : arr) {
			System.out.print(a);
		}

	}

}
