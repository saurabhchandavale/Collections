package com.string;

public class SplitStringToStringArray {
	
	public void splitString(String str) {
		String split[] = str.split(",");
		for(int i =0 ; i < split.length; i++) {
			System.out.print(split[i]);
		}
		System.out.println();
		
		
		String str1 = "saurabh@gmail.com";
		String a[] = str1.split("@");
		String s = a[a.length-1];
		int index = s.lastIndexOf(".");
		String domin = s.substring(0,index);
		System.out.println(domin);
	}
	
	public void printAllSubstring(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j <= str.length(); j++) {
				System.out.print(str.subSequence(i, j) + " ");
			}
		}
	}
	
	public void reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		int n = str.length();
		for(int i = 0; i < n/2;i++) {
			char firstChar = sb.charAt(i);
			char lastChar = sb.charAt(n-i-1);
			sb.setCharAt(i, lastChar);
			sb.setCharAt(n-1-i, firstChar);
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitStringToStringArray s = new SplitStringToStringArray();
		String str =  "ABC, BCD, CDE, DEF, FGH";
	//	s.splitString(str);
		String str1 = "ABC";
		s.printAllSubstring(str1);
		s.reverseString(str1);

	}

}
