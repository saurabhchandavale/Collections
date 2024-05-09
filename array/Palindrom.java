package com.array;

public class Palindrom {
	
	public static boolean palindrom(String str) {
		char[] c = str.toCharArray();
		int start = 0;
		int end =  str.length() - 1;
		
		while(start < end) {
			if(c[start] != c[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12321";
		boolean ans = palindrom(str);
		System.out.println(ans);
	}

}
