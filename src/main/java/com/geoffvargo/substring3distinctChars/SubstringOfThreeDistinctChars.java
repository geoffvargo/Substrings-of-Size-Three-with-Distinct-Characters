package com.geoffvargo.substring3distinctChars;

class SubstringOfThreeDistinctChars {
	/**
	 * A string is <b>good <u><i>if there are no repeated characters</i></u></b>.
	 * Given a string <b><code>s</code></b>, return the number of <b>good substrings of length three</b> in <b><code>s</code></b>.
	 * Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
	 * <p/>
	 * A <b><i>substring</i></b> is a contiguous sequence of characters in a string.
	 * <p/>
	 * <h3>Example 1:</h3>
	 * {@code }
	 *
	 * <blockquote>
	 * <b><i>Input:</i></b> {@code s = "xyzzaz"}<br>
	 * <b><i>Output:</i></b> {@code 1}<br>
	 * <b><i>Explanation:</i></b> There are 4 substrings of size 3: {@code "xyz", "yzz", "zza",} and {@code "zaz"}.
	 * The only good substring of length 3 is <code>"xyz"</code>.
	 * </blockquote>
	 * <p>
	 * <p/>
	 *
	 * <h3>Example 2:</h3>
	 * <blockquote>
	 * <i><b>Input:</b></i> {@code s = "aababcabc"}<br>
	 * <i><b>Output:</b></i> 4<br>
	 * <i><b>Explanation:</b></i> There are 7 {@code substrings} of size 3: {@code "aab", "aba", "bab", "abc", "bca", "cab",} and {@code "abc"}.
	 * The good substrings are {@code "abc", "bca", "cab",} and {@code "abc"}.
	 * </blockquote>
	 */
	public int countGoodSubstrings(String s) {
		String[] splitty = s.split("");
		return 0;
	}
}
