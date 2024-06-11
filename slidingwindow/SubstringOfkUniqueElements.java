package com.slidingwindow;

public class SubstringOfkUniqueElements {
	
	public int longestKSubstring(String str, int k) {
		int n = str.length();
		int windowStart = 0;
		int windowEnd = 0;
		int len = 0;
		int maxLen = Integer.MIN_VALUE;
		int freqHash[] = new int[26];
		int uniqueCharCount = 0;
		
		while(windowEnd < n) {
			int index = str.charAt(windowEnd) -97;
			if(freqHash[index]==0) {
				uniqueCharCount++;
				freqHash[index]++;
			}else {
				freqHash[index]++;
			}
			if(uniqueCharCount==k) {
				len = windowEnd-windowStart+1;
				maxLen = Math.max(len, maxLen);
			}else if(uniqueCharCount > k) {
				while(windowStart < windowEnd && uniqueCharCount > k) {
					index = str.charAt(windowStart)-97;
					windowStart++;
					freqHash[index]--;
				}
				if(freqHash[index]==0) {
					uniqueCharCount--;
				}
			}
			windowEnd++;
		}
		return (maxLen == Integer.MIN_VALUE)?-1:maxLen;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubstringOfkUniqueElements s = new SubstringOfkUniqueElements();
		String str = "aabacbebebe";
		int longestKSubstring = s.longestKSubstring(str, 3);
		System.out.println(longestKSubstring);
	}

}
