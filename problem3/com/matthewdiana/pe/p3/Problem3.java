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

package com.matthewdiana.pe.p3;

import java.math.BigInteger;

public class Problem3 {
	
	private static final String numStr = "600851475143";

	public static void main (String[] args ) {
		
		// Because 600851475143 is larger than 32-bit two's complement maximum value, we
		// will use java.math.BigInteger to perform arithmetic operations on this value.
		BigInteger bigNum = new BigInteger(numStr);
		
		// We can use BigInteger.nextProbablePrime() as our increment statement, allowing us
		// to only have to check for divisibility between bigNum and i.
		BigInteger largestPrimeFactor = BigInteger.ONE;
		for (BigInteger i = BigInteger.ONE; bigNum.compareTo(i) >= 0; i = i.nextProbablePrime()) {
			if ( (bigNum.mod(i)).compareTo(BigInteger.ZERO) == 0) {
				largestPrimeFactor = new BigInteger(i.toString());
				bigNum = bigNum.divide(i);
			}
		}
		
		System.out.println(largestPrimeFactor);
		
	}

}
