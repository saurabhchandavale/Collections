package com.slidingwindow;

public class FindMaxConsecutineOnce {
	
	public int consecutiveOnce(int arr[]) {
		int maxConOnce = 0;
		int k = 2;   // K is the value of flip allowed
		int zeroCount = 0;
		int start = 0;
		
		for(int end = 0; end < arr.length; end++) {
			if(arr[end]==0)
				zeroCount++;
			
		while(zeroCount > k) {
				if(arr[start] == 0)
					zeroCount--;
				
				start++;
			}
			maxConOnce = Math.max(maxConOnce, end-start+1);
		}
		return maxConOnce;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMaxConsecutineOnce f = new FindMaxConsecutineOnce();
		int arr[] = {1,1,0,0,0,1,1,1,1,1};
		int consecutiveOnce = f.consecutiveOnce(arr);
		System.out.println(consecutiveOnce);
		
	}

}
