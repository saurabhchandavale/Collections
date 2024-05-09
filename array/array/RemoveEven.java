package com.array;

public class RemoveEven {

	public static int[] removeEven(int arr[]) 
	{
		int oddCount = 0;
		for(int i = 0; i < arr.length-1;i++) {
			if(arr[i]%2!=0) {
				oddCount++;
			}
		}
		
		int[] oddArray = new int[oddCount];
		int indx = 0;
		for(int i = 0; i < arr.length-1;i++) {
			
			if(arr[i]%2!=0) {
				oddArray[indx] = arr[i];
				indx++;
			}
		}
		return oddArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveEven rm = new RemoveEven();
		int[] arr = {2,3,4,5,6,7,8};
		int[] result = removeEven( arr);
		System.out.println(result);
	}

}
