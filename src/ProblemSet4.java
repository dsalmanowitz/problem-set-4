/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps4 = new ProblemSet4();
		//ps4.surroundMe("AABB", "XYZ");
		//ps4.endsMeet("adios", 2);
		//ps4.middleMan("adios");
		//ps4.doubleVision("adios");
		//ps4.centered("DENNIS", "ENN");
		//ps4.upOrDown(1.5, 'r');
		//ps4.countMe("Jerry hay boy", 'y');
		//ps4.isNotEqual("is not is not is");
		ps4.triplets("aaabbcc");
	}
	
	/**
	 * @surroundMe is a public method that accepts two Strings as input, and
	 * returns a single String as output.
	 * 
	 * Given two Strings, @out and @in, return a new String built by surrounding @in
	 * with the first and last two characters of @out. Return null if the input
	 * specifications are not met.
	 * 
	 * @param out - a 4-character String of the format AABB
	 * @param in - a 3-character String of the format XYZ
	 * 
	 * @return a String constructed from @in and @out of the format AAXYZBB
	 */
	
	public String surroundMe(String out, String in) {
		String result = out.substring(0, 2) + in + out.substring(2, 4);
		if (out.length() == 4 && in.length() == 3) {
			return result;
		}
		else {
			return null;
		}
	}
	
	/**
	 * @endsMeet is a public method that accepts a String and an integer as input, and
	 * returns a single String as output.
	 * 
	 * Given a String, @str, and an integer, @n, return a new String built by
	 * combining the first @n and last @n characters of @str. Return null if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String whose length falls in the range [1, 10]
	 * @param n - an integer no greater than the length of @str
	 * 
	 * @return a String constructed from the first @n and last @n characters of @str
	 */
	
	public String endsMeet(String str, int n) {
		if (str.length() < 1 || str.length() > 10 || n > str.length()) {
			return null;
		} else {
			return str.substring(0, n) + str.substring(str.length() - n);
		}
	}
	
	/**
	 * @middleMan is a public method that accepts a single String as input, and
	 * returns a single String as output.
	 * 
	 * Given a String whose length is odd, return a 3-character String built from the
	 * 3 middle characters of the original String. Return null if the input
	 * specifications are not met.
	 * 
	 * @param str - a String whose length is odd
	 * 
	 * @return a 3-character String constructed from the middle 3 characters of @str
	 */
	
	public String middleMan(String str) {
		int n;
		if (str.length() % 2 == 1) {
			n = str.length() / 2;
			return str.substring(n - 1, n + 2);
		} else {
			return null;
		}
	}
	
	/**
	 * @doubleVision is a public method that accepts a single String as input, and
	 * returns a single String as output.
	 * 
	 * Given a String whose length is at least 1, return a String built from duplicating
	 * every character from the original String. Return null if the input
	 * Specifications are not met.
	 * 
	 * @param str - a String whose length is at least 1 in the format ABC
	 * 
	 * @return a String where each character in @str is duplicated in the format AABBCC
	 */
	
	public String doubleVision(String str) {
		String duplicate = "";
		if (str.length() > 1) {
			for (int i = 0; i < str.length(); i++) {
				String c = str.charAt(i) + "";
				duplicate += (c + c);
			}
			return duplicate;
		} else {
			return null;
		}
	}
	
	/**
	 * @centered is a public method that accepts a single String as input, and
	 * returns a boolean as output.
	 * 
	 * Given a String, determine whether or not a target sequence is in the middle of the
	 * original String. The middle of a String will be defined as follows: the number of
	 * characters the left and right of the target sequence differ by at most 1. Return
	 * false if the input specifcations are not met.
	 * 
	 * @param str - a String that contains @target
	 * @param target - a 3-character String of the format ABC
	 * 
	 * @return true if @target is in the middle of @str and false if it is not
	 */
	
	public boolean centered(String str, String target) {
		int mid = str.length()/2;
		if (target.length() != 3) {
			return false;
		} else if (str.length() % 2 == 1) {
			if (str.substring(mid - 1, mid + 2).equals(target)) {
				return true;
			} else {
				return false;
			}
		} else {
			if (str.substring(mid - 1, mid + 2).equals(target) || str.substring(mid - 2, mid + 1).equals(target)) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	/**
	 * @upOrDown is a public method that accepts a decimal value and a character as
	 * input, and returns an integer as output.
	 * 
	 * Given a decimal value and a character representing either rounding up (+),
	 * rounding down (-), flooring (f), or ceiling (c), return the result of the
	 * operation as an @int. Return -1 if the input specifcations are not met.
	 * 
	 * @param number - a decimal value
	 * @param operation - a @char in the set [+, -, f, c]
	 * 
	 * @return the result of the operation as an @int
	 */
	
	public int upOrDown(double number, char operation) {
		if (operation == 'c') {
			return (int)Math.ceil(number);
		} else if (operation == 'f') {
			return (int)Math.floor(number);
		} else if (operation == 'r') {
			return (int)Math.round(number);
		} else {
			return -1;
		}
	}
	 
	/**
	 * @countMe is a public method that accepts a String and a character as input,
	 * and returns an integer as output.
	 * 
	 * Given a String and a character, count and return the number of words in the
	 * specified String that end in the specified character. For our purposes, the
	 * end of a word will be defined as an alphabetic character followed by whitespace
	 * (i.e., a space, tab, or line break). Return -1 if the input specifcations are
	 * not met.
	 * 
	 * @param text - a sequence of alphabetic and whitespace characters
	 * @param end - a character in the range [Aa-Zz]
	 * 
	 * @return the number of words in @text that end with @end
	 */
	
	public int countMe(String text, char end) {
		int count = 0;
		for (int i = 0; i < text.length() - 1; i++) {
			if (text.charAt(i+1) == ' ' || text.charAt(i+1) == '\t' || text.charAt(i+1) == '\n') {
				if (text.charAt(i) == end) {
					count++;
				}
			}
			if (!Character.isAlphabetic(text.charAt(i)) && !Character.isWhitespace(text.charAt(i))) {
				return -1;
			}
		}
		if (text.charAt(text.length()-1) == end) {
			count++;
		}
		if (Character.isAlphabetic(end)) {
			return count;
		} else {
			return -1;
		}
	}
	
	/**
	 * @isNotEqual is a public method that accepts a String as input, and
	 * returns a boolean as output.
	 * 
	 * Given a String of text, determine whether the number of case-sensitive appearances
	 * of the word is equals the number of case-sensitive appearances of not. Return
	 * false if the input specifcations are not met.
	 * 
	 * @param str - a String of text containing 0 or more appearances of is and not
	 * 
	 * @return true if the appearances of is == the appearances of not; false otherwise
	 */
	
	public boolean isNotEqual(String str) {
		int countIs = 0;
		int countNot = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 2).equals("is")) {
				countIs++;
			}
		}
		for (int j = 0; j < str.length() - 3; j++) {
			if (str.substring(j, j + 3).equals("not")) {
				countNot++;
			}
		}
		if (str.substring(str.length() - 2).equals("is")) {
			countIs++;
		} else if (str.substring(str.length() - 3).equals("not")) {
			countNot++;
		}
		if (countIs == countNot) {
			return true;
		} else {
			return false;
		}
	}

	
	/**
	 * @triplets is a public method that accepts a single String as input, and
	 * returns an integer as output.
	 * 
	 * Given a String of case-insenstive letters, return the number of triplets. A triplet
	 * is defined as a case-sensitive sequence of 3 identical characters in a row. A triplet
	 * can overlap, meanning AAAA counts as 2 triplets. Return -1 if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String of alphabetic letters without whitespace
	 * 
	 * @return the number of triplets in @str
	 */
	
	public int triplets(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == str.charAt(i++) && str.charAt(i) == str.charAt(i+2)) {
				count++;
			} else if (!Character.isAlphabetic(str.charAt(i))) {
				return -1;
			}
		}
		if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2) && str.charAt(str.length() - 2) == str.charAt(str.length() - 3)) {
			count++;
		}
		System.out.print(count);
		return count;
	}

	
	/**
	 * @addMe is a public method that accepts a String and a boolean as input, and
	 * returns an integer as output.
	 * 
	 * Given a String, compute and return either the sum of the digits or the sum of the numbers
	 * contained within that String. If @digits is true, then sum the digits individually. If it
	 * is false, sum the numbers. A number is defined as a consecutive series (possibly 1) of
	 * digits in the String. Return -1 if the input specifcations are violated.
	 * 
	 * @param str - a String of alphanumeric text
	 * @param digits - indicates whether to sum the digits or the numbers
	 * 
	 * @return the sum of the digits or numbers as specified by @digits
	 */
	
	// your method signature here
}
