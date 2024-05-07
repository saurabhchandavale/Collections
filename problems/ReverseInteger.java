package com.problems;

public class ReverseInteger {
	
	public int reverse(int number) {
		boolean isNegative = number < 0;
		if(isNegative) {
			number = number * -1;
		}
		int lastdigit = 0;
		int rev = 0;
		
		while(number > 0) {
			lastdigit = number % 10;
			rev = rev * 10 + lastdigit;
			number = number/10;
		}
		return isNegative ? rev * -1: rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger r = new ReverseInteger();
		int number = -123456;
		int reverse = r.reverse(number);
		System.out.println(reverse);

	}

}
