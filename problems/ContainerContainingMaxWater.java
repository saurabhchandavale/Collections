package com.problems;

public class ContainerContainingMaxWater {
	
	public int maxArea(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		int maxArea = 0;
		while(left < right) {
			int area = Math.min(arr[left], arr[right]) * (right - left);
			maxArea = Math.max(maxArea, area);
			
			if(arr[left] < arr[right]) {
				left++;
			}else {
				right--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainerContainingMaxWater c = new ContainerContainingMaxWater();
		int arr[] = {1,8,6,2,5,4,8,3,7,8};
		int maxArea = c.maxArea(arr);
		System.out.println(maxArea);
	}

}
