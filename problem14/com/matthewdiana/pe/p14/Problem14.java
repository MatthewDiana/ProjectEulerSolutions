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

package com.matthewdiana.pe.p14;

public class Problem14 {

    public static void main(String[] args) {

        long bestStartingNum = 1, longestChain = 0;

        for (int i = 1; i <= 1000000; i++) {
            long currentNum = i, chainCount = 1;
            while (currentNum != 1) {
                if (currentNum % 2 == 0)
                    currentNum = currentNum / 2;
                else
                    currentNum = (currentNum * 3) + 1;
                chainCount++;
            }

            if (chainCount > longestChain) {
                longestChain = chainCount;
                bestStartingNum = i;
            }
        }

        System.out.println(bestStartingNum);

    }

}
