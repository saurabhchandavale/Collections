package com.string;

public class ReverseWordsInString {
	
	public String reverseWords(String str) {
		char arr[] = str.toCharArray();
		int length = arr.length;
		int start = 0;
		for(int end = 0; end <= length; end++) {
			if(end==length || arr[end]==' ') {
				reverse(arr,start,end-1);
				start = end+1;
			}
		}
		return new String(arr);
	}

	public void reverse(char[] arr, int start, int end) {
		while(start <  end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsInString r = new ReverseWordsInString();
		String str = "Saurabh Chandavale";
		String reverseWords = r.reverseWords(str);
		System.out.println(reverseWords);
	}

}
