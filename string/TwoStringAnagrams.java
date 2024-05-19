package com.string;

import java.util.Arrays;

public class TwoStringAnagrams {
	
	public boolean isAnagram(String A, String B) {
		if(A.length()!=B.length()) {
			return false;
			
		}
		char arrA[] = A.toCharArray();
		char arrB[] = B.toCharArray();
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		int length = A.length();
		int indexA = 0;
		int indexB = 0;
		while(indexA < length && indexB < length) {
			if(arrA[indexA] != arrB[indexB]) {
				return false;
			}
			indexA++;
			indexB++;
		}
		
		return true;
	}
	
	public boolean isAnagram1(String A , String B) {
		if(A.length()!= B.length()) {
			return false;
			
		}
		int length = A.length();
		int freq[] = new int[26];
		int indexA = 0;
		int indexB = 0;
		while(indexA < length && indexB < length) {
			char a = A.charAt(indexA);
			int freqA = a-97;
			freq[indexA] += 1;
			char b = B.charAt(indexB);
			int freqB = b-97;
			freq[indexB] -= 1;
			indexA++;
			indexB++;
			
		}
		for(int i : freq) {
			if(freq[i]!=0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoStringAnagrams t = new TwoStringAnagrams();
		String A = "namanna";
		String B = "anmann";
		//boolean anagram = t.isAnagram(A, B);
		//System.out.println(anagram);
		boolean anagram1 = t.isAnagram1(A, B);
		System.out.println(anagram1);
	}

}
