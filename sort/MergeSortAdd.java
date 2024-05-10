package com.search;

public class MergeSortAdd {

	public int[] mergeSort(int[] arr1, int[] arr2, int n, int m) {
		int[] result = new int[n + m];
		int i = 0, j = 0, k = 0;

		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				result[k] = arr1[i];

				i++;
			} else {
				result[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < n) {
			result[k] = arr1[i];
			i++;
			k++;
		}
		while (j < m) {
			result[k] = arr2[j];
			j++;
			k++;
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortAdd z = new MergeSortAdd();
		int[] arr1 = { 1, 3, 3, 5 };
		int[] arr2 = { 2, 4, 6 };
		int n = arr1.length;
		int m = arr2.length;
		int[] mergeSort = z.mergeSort(arr1, arr2, n, m);
		for (int x : mergeSort) {
			System.out.print(x);
		}

	}

}
