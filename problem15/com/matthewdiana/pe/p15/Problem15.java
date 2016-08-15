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

package com.matthewdiana.pe.p15;

import java.math.BigInteger;

public class Problem15 {

    private static final int GRID_SIZE = 20;
    private static long routeCount = 0;

    public static void main(String[] args) {

        int grid[][] = new int[GRID_SIZE][GRID_SIZE];
        traverse(grid, 0, 0);
        System.out.println(routeCount);

    }

    private static void traverse(int grid[][], int curX, int curY) {
        if (curX < GRID_SIZE || curY < GRID_SIZE) {
            if (curX < GRID_SIZE) {
                traverse(grid, curX+1, curY);
            }
            if (curY < GRID_SIZE) {
                traverse(grid, curX, curY+1);
            }
        } else {
            routeCount++;
        }
    }
}
