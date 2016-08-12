/*
	The MIT License (MIT)
	
	Copyright (c) 2014 Matthew Diana
	
	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:
	
	The above copyright notice and this permission notice shall be included in all
	copies or substantial portions of the Software.
	
	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
	SOFTWARE.
*/

package com.matthewdiana.pe.p4;

public class Problem4 {

	public static void main (String[] args) {
		
		int largestPalindrome = 0;
		
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				int currentNum = i * j;
				if (isPalindrome(currentNum) && currentNum > largestPalindrome)
						largestPalindrome = currentNum;	
			}
		}
		
		System.out.println(largestPalindrome);
		
	}
	
	// Checks whether the first half of num equals the reversed second half of num.
	public static boolean isPalindrome(int num) {
		
		String numStr = Integer.toString(num);
		int numLength = numStr.length();
		
		// A number cannot be a palindrome if its string length is odd.
		if (numLength % 2 != 0)
			return false;

		String firstHalf = numStr.substring(0, numLength/2);
		String secondHalf = numStr.substring(numLength/2, numLength);
		
		String secondHalfFlipped = "";
		for (int i = secondHalf.length()-1; i >= 0; i--)
			secondHalfFlipped += secondHalf.charAt(i);
		
		if (!firstHalf.equals(secondHalfFlipped))
			return false;
				
		return true;
		
	}
	
}
