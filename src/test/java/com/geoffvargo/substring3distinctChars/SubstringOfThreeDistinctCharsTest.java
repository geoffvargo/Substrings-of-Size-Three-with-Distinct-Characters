package com.geoffvargo.substring3distinctChars;

import static org.junit.jupiter.api.Assertions.*;

class SubstringOfThreeDistinctCharsTest {
	
	@org.junit.jupiter.api.Test
	void countGoodSubstrings_TEST1() {
		String input = "xyzzaz";
		assertEquals(1, SubstringOfThreeDistinctChars.countGoodSubstrings(input));
	}
	
	@org.junit.jupiter.api.Test
	void countGoodSubstrings_TEST2() {
		String input = "aababcabc";
		assertEquals(4, SubstringOfThreeDistinctChars.countGoodSubstrings(input));
	}
}