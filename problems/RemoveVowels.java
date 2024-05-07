package com.problems;

import java.util.Set;

public class RemoveVowels {
	
	public String removeVowels(String str1) {
		String str = str1.toLowerCase();
		Set<Character> vowels = Set.of('a','e','i','o','u');
		char chars[] = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char ch : chars) {
			if(!vowels.contains(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveVowels v = new RemoveVowels();
		String str = "Ice cream";
		String removeVowels = v.removeVowels(str);
		System.out.println(removeVowels);
	}

}
