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

package com.matthewdiana.pe.p9;

public class Problem9 {

	public static void main(String[] args) {
		
		int abcProduct = 0;
		boolean found = false;
		
		for (int a = 1; a < 1000 && !found; a++) {
			for (int b = 1; b < 1000 && !found; b++) {
				for (int c = 1; c < 1000 && !found; c++) {
					if ( (a < b && b < c) && isPythagoreanTriple(a, b, c) && (a + b + c == 1000) ) {
						abcProduct = a * b * c;
						found = true;
					}
				}
			}
		}
		
		System.out.println(abcProduct);
		
	}
	
	public static boolean isPythagoreanTriple(int a, int b, int c) {
		
		int aSquared = (int) Math.pow(a, 2);
		int bSquared = (int) Math.pow(b, 2);
		int cSquared = (int) Math.pow(c, 2);
		
		if (aSquared + bSquared == cSquared)
			return true;
		else
			return false;
		
	}
	
}
