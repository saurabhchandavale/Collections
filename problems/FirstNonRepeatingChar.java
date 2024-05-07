package com.problems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	
	public int nonRepeatingChar(String str) {
		Map<Character,Integer> map = new HashMap<>();
		char[] chars = str.toCharArray();
		for(char ch : chars)
		{
			map.put(ch,map.getOrDefault(ch, 0) + 1);
		}
		
		for(int i = 0; i < chars.length; i++) {
			char ch = chars[i];
			if(map.get(ch) == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstNonRepeatingChar f = new FirstNonRepeatingChar();
		String str = "codecode";
		int nonRepeatingChar = f.nonRepeatingChar(str);
		System.out.println(nonRepeatingChar);
	}

}
