package com.string;

import java.util.Stack;

public class BalanceBracketing {
	
	public int balance(String str) {
		if(str.length()%2!=0) {
			return -1;
		}
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < str.length();i++) {
			char ch = str.charAt(i);
			if(ch == '{') {
				stack.push(ch);
			}else {
				if(stack.isEmpty() || stack.peek() == '}') {
					stack.push('}');
				}else {
					stack.pop();
				}
			}
		}
		int open = 0;
		int close = 0;
		int ans = 0;
		while(!stack.isEmpty()) {
			if(stack.pop()== '{') {
				open++;
			}else {
				close++;
			}
			 ans = (int)(Math.ceil(open/2.0) + Math.ceil(close/2.0));
		}
		return ans;
	}
	
	public int optmize(String str) {
		if(str.length()%2!=0) {
			return -1;
		}
		int ans = 0;
		int open = 0;
		int close = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '{') {
				open++;
			}else {
				if(open <= 0 || ch == '}') {
					if(open > 0) {
						open--;
					}else {
					close++;
					}
				}
			}
			ans = (int)(Math.ceil(open/2.0) + Math.ceil(close/2.0));
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BalanceBracketing b = new BalanceBracketing();
		String str = "}}}{{}}{{{";
		int balance = b.balance(str);
		System.out.println(balance);
		int optmize = b.optmize(str);
		System.out.println(optmize);
	}

}
