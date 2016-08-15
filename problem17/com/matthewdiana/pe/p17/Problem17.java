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

package com.matthewdiana.pe.p17;

import java.util.HashMap;
import java.util.Map;

public class Problem17 {

    // Maps 0-9 to their string representation
    private static final Map<String, String> NUM_TO_WORD_SINGLES_MAP = new HashMap<>();

    // Maps 11-19 to their spring representation
    private static final Map<String, String> NUM_TO_WORD_TEENS_MAP = new HashMap<>();

    // Maps 20-99 to their spring representation
    private static final Map<String, String> NUM_TO_WORD_TENS_MAP = new HashMap<>();


    static {
        NUM_TO_WORD_SINGLES_MAP.put("0", "");
        NUM_TO_WORD_SINGLES_MAP.put("1", "ONE");
        NUM_TO_WORD_SINGLES_MAP.put("2", "TWO");
        NUM_TO_WORD_SINGLES_MAP.put("3", "THREE");
        NUM_TO_WORD_SINGLES_MAP.put("4", "FOUR");
        NUM_TO_WORD_SINGLES_MAP.put("5", "FIVE");
        NUM_TO_WORD_SINGLES_MAP.put("6", "SIX");
        NUM_TO_WORD_SINGLES_MAP.put("7", "SEVEN");
        NUM_TO_WORD_SINGLES_MAP.put("8", "EIGHT");
        NUM_TO_WORD_SINGLES_MAP.put("9", "NINE");


        NUM_TO_WORD_TEENS_MAP.put("1", "ELEVEN");
        NUM_TO_WORD_TEENS_MAP.put("2", "TWELVE");
        NUM_TO_WORD_TEENS_MAP.put("3", "THIRTEEN");
        NUM_TO_WORD_TEENS_MAP.put("4", "FOURTEEN");
        NUM_TO_WORD_TEENS_MAP.put("5", "FIFTEEN");
        NUM_TO_WORD_TEENS_MAP.put("6", "SIXTEEN");
        NUM_TO_WORD_TEENS_MAP.put("7", "SEVENTEEN");
        NUM_TO_WORD_TEENS_MAP.put("8", "EIGHTEEN");
        NUM_TO_WORD_TEENS_MAP.put("9", "NINETEEN");

        NUM_TO_WORD_TENS_MAP.put("0", "");
        NUM_TO_WORD_TENS_MAP.put("1", "TEN");
        NUM_TO_WORD_TENS_MAP.put("2", "TWENTY");
        NUM_TO_WORD_TENS_MAP.put("3", "THIRTY");
        NUM_TO_WORD_TENS_MAP.put("4", "FORTY");
        NUM_TO_WORD_TENS_MAP.put("5", "FIFTY");
        NUM_TO_WORD_TENS_MAP.put("6", "SIXTY");
        NUM_TO_WORD_TENS_MAP.put("7", "SEVENTY");
        NUM_TO_WORD_TENS_MAP.put("8", "EIGHTY");
        NUM_TO_WORD_TENS_MAP.put("9", "NINETY");

    }


    public static void main(String[] args) {

        int letterCount = 0;
        for (int i = 1; i <= 1000; i++) {
            letterCount += numToWords(i).toString().length();
        }
        System.out.println(letterCount);

    }

    public static String numToWords(int num) {

        StringBuilder numInWords = new StringBuilder();
        String numStr = Integer.toString(num);

        if (numStr.length() == 1) {        // Single digit number
            numInWords.append(NUM_TO_WORD_SINGLES_MAP.get(numStr));
        } else if (numStr.length() == 2) { // 2-digit number
            if (numStr.charAt(0) == '1') {
                if (numStr.charAt(1) != '0') {
                    numInWords.append(NUM_TO_WORD_TEENS_MAP.get(Character.toString(numStr.charAt(1))));
                } else {
                    numInWords.append(NUM_TO_WORD_TENS_MAP.get(Character.toString(numStr.charAt(0))));
                }
            } else {
                numInWords.append(NUM_TO_WORD_TENS_MAP.get(Character.toString(numStr.charAt(0))));
                numInWords.append(NUM_TO_WORD_SINGLES_MAP.get(Character.toString(numStr.charAt(1))));
            }
        } else if (numStr.length() == 3) {
            numInWords.append(NUM_TO_WORD_SINGLES_MAP.get(Character.toString(numStr.charAt(0)))+"HUNDRED");
            if (numStr.charAt(1) != '0' || numStr.charAt(2) != '0') {
                numInWords.append("AND");
                if (numStr.charAt(1) == '1') {
                    if (numStr.charAt(2) != '0') {
                        numInWords.append(NUM_TO_WORD_TEENS_MAP.get(Character.toString(numStr.charAt(2))));
                    } else {
                        numInWords.append(NUM_TO_WORD_TENS_MAP.get(Character.toString(numStr.charAt(1))));
                    }
                } else {
                    numInWords.append(NUM_TO_WORD_TENS_MAP.get(Character.toString(numStr.charAt(1))));
                    numInWords.append(NUM_TO_WORD_SINGLES_MAP.get(Character.toString(numStr.charAt(2))));
                }
            }
        } else if (numStr.length() == 4) {
            // we made it!
            numInWords.append("ONETHOUSAND");
        }

        return numInWords.toString();
    }
}
