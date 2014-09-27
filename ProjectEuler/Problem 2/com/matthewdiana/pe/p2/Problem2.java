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

package com.matthewdiana.pe.p2;

public class Problem2 {
	
	private static final int MAX_VALUE = 4000000;

	public static void main (String[] args) {
		
		// Begin the recursive call by passing arguments of the first two values of the Fibonacci
		// sequence (F(1)=1, F(2)=1) and by beginning the sum at the value 0.
		int sum = evenFibSum(1, 1, 0);
		
		System.out.println(sum);
		
	}
	
	// Method using tail recursion to calculate the sum of even numbers until F(x) > MAX_VALUE
	public static int evenFibSum(int num1, int num2, int sum) {
		
		if (num2 > MAX_VALUE) {
			return sum;
		} 
		if (num2 % 2 == 0)
			sum += num2;
		return evenFibSum(num2, num1+num2, sum);
		
	}
	
}
