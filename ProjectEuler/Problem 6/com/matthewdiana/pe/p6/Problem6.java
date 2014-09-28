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

package com.matthewdiana.pe.p6;

public class Problem6 {
	
	public static void main(String[] args) {
		
		int sumOfNaturalNumbers = 0, sumOfSquaredNaturalNumbers = 0, sumOfNaturalNumbersSquared = 0;
		for (int i = 1; i <= 100; i++) {
			sumOfNaturalNumbers += i;
			sumOfSquaredNaturalNumbers += Math.pow(i, 2);
		}
			
		// 2^n, where n is an element of Z, can never be a fraction.
		// Therefore it is safe to cast this to an int.
		sumOfNaturalNumbersSquared = (int) Math.pow(sumOfNaturalNumbers, 2);
		
		int sumSquareDifference = sumOfNaturalNumbersSquared - sumOfSquaredNaturalNumbers;
		
		System.out.println(sumSquareDifference);
		
	}
	
}
