package com.problems;

import java.util.HashMap;

public class MaxlengthOfSubstring {
	
	public int maxlength(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int maxLength = 0;
		int start = 0;
		
		for(int end = 0; end < str.length(); end++) {
			char rightChar = str.charAt(end);
			if(map.containsKey(rightChar)) {
				 start = Math.max(start, map.get(rightChar) + 1);
			}
			map.put(rightChar, end);
			maxLength = Math.max(maxLength, (end-start) + 1);
			
		}
		return maxLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxlengthOfSubstring m = new MaxlengthOfSubstring();
		String str = "aaabcdqwert";
		int maxlength = m.maxlength(str);
		System.out.println(maxlength);

	}

}
