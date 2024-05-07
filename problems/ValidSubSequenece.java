package com.problems;

public class ValidSubSequenece {
	
	public boolean validSubSequence(String str, String sub) {
		int i = 0;
		int j = 0;
		while(i < str.length() && j < sub.length()) {
			if(str.charAt(i) == sub.charAt(j)) {
				j++;
			}
			i++;
		}
		return j == sub.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcde";
		String sub = "acce";
		ValidSubSequenece v = new ValidSubSequenece();
		boolean validSubSequence = v.validSubSequence(str, sub);
		System.out.println(validSubSequence);

	}

}
