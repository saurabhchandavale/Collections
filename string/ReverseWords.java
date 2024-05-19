package com.string;

public class ReverseWords {
	
	public String reverseWords(String str) {
		String res = "";
		String str1[] = str.split(" ");
		for(int i = str1.length-1 ; i>= 0; i--) {
			if(str1[i].length()==0) {
				continue;
			}
			
			if(res.length()==0) {
				res = str1[i];
			}else {
				res = res + " " + str1[i];
			}
		}
		return res;
	}
	
	public String reverseWords1(String str) {
		StringBuilder res = new StringBuilder();
		String str1[] = str.split(" ");
		for(int i = str1.length-1 ; i>= 0; i--) {
			if(str1[i].length()==0) {
				continue;
			}
			
			if(res.length()==0) {
				res.append(str1[i]);
			}else {
				res.append(" ");

				res.append(str1[i]);
			}
		}
		return res.toString();
	}
	
	public String reverse(String str) {
		StringBuilder res = new StringBuilder();
		int startIndex = str.length()-1;
		while(startIndex >= 0) {
			while(startIndex >= 0 && str.charAt(startIndex) == ' ') {
				startIndex--;
			}
			if(startIndex < 0) {
				break;
			}
			int endIndex = startIndex;
			while(startIndex >= 0&&str.charAt(startIndex) != ' ') {
				startIndex--;
			}
			if(res.length()==0) {
				res.append(str.substring(startIndex+1, endIndex+1));
			}else {
				res.append(" ");
				res.append(str.substring(startIndex+1, endIndex+1));

			}
			
		}
		
		return res.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWords r = new ReverseWords();
		String str = "I am    coder   ";
		String reverseWords = r.reverseWords(str);
		System.out.println(reverseWords);
		String reverseWords1 = r.reverseWords1(str);
		System.out.println(reverseWords1);
		String reverseWords2 = r.reverse(str);
		System.out.println(reverseWords2);

	}

}
