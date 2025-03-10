package com.qa.testdrivendevelopment;

public class Questions {

	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Given a string, return a string where for every char in the original string,
	 * there are three chars.<br>
	 * <br>
	 * 
	 * For Example:<br>
	 * multChar("The") → "TTThhheee"<br>
	 * multChar("AAbb") → "AAAAAAbbbbbb"<br>
	 * multChar("Hi-There") → "HHHiii---TTThhheeerrreee"
	 */
	public String multiChar(String input) {
		return "";
	}

	/**
	 * Return the string (backwards) that is between the first and last appearance
	 * of "bread" in the given string, or return the empty string "" if there is not
	 * 2 occurances of "bread". Ignore Case<br>
	 * <br>
	 * For Example: sandwichFilling("breadclivebread") → "evilc"<br>
	 * sandwichFilling("xxbreadfridgebreadyy") → "egdirf"<br>
	 * sandwichFilling("xxBreadfridgeBReAdyy") → "egdirf"<br>
	 * sandwichFilling("xxbreadyy") → "" sandwichFilling("xxbreADyy") → ""<br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */

	public String sandwichFilling(String sandwich) {
		return "";
	}

	/**
	 * Given three ints, a b c, one of them is small, one is medium and one is
	 * large. Return true if the three values are evenly spaced, so the difference
	 * between small and medium is the same as the difference between medium and
	 * large. Do not assume the ints will come to you in a reasonable order.<br>
	 * <br>
	 * For Example:<br>
	 * evenlySpaced(2, 4, 6) → true<br>
	 * evenlySpaced(4, 6, 2) → true<br>
	 * evenlySpaced(4, 6, 3) → false<br>
	 * evenlySpaced(4, 60, 9) → false
	 */
	/* 246, 642, 462, 264, 426, 624 */
	public boolean evenlySpaced(int a, int b, int c) {
//		if a / b = b/c   6 4 2
		int differenceAB = a - b;
		int differenceCB = c - b;
		int differenceAC = a - c;
		int differenceBC = b - c;
		int differenceBA = b - a;
		int differenceCA = c - a;
		if (differenceBA == differenceCB || differenceBA == differenceAC || differenceAB == differenceBC
				|| differenceBA == differenceBC || differenceAB == differenceCB || differenceAC == differenceCB) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Given a string and an int n, return a string that removes n letters from
	 * the'middle' of the string. The string length will be at least n. The input
	 * string will have an odd number of letters. n will always be an odd
	 * number.<br>
	 * <br>
	 * For Example:<br>
	 * nMid("Hello", 3) → "Ho"<br>
	 * nMid("Chocolate", 3) → "Choate"<br>
	 * nMid("Chocolate", 1) → "Choclate"<br>
	 */
	public String nMid(String input, int n) {
		return "";
	}

	/**
	 * Given a string, return the boolean True if it ends in "java" and False if it
	 * does not end in "java". Ignore Case.<br>
	 * <br>
	 * For Example: <br>
	 * endsJava("ilovejava") → true <br>
	 * endsJava("iloveJaVa") → true <br>
	 * endsJava("welovejava") → true <br>
	 * endsJava("welovejavamoreeveryday") → false <br>
	 * endsJava("javaiscool") → false <br>
	 * endsJava("pythoniscool") → false <br>
	 */
//	
	public boolean endsJava(String input) {
		String java = input.toLowerCase();
		boolean endsWithJava = false;
		if(java.endsWith("java")) {
			endsWithJava = true;
		}

		else {
			endsWithJava = false;
		}
		
		return endsWithJava;
	}

	/**
	 * Given a string, return the length of the largest "block" in the string. A
	 * block is a run of adjacent chars that are the same, do not ignore case.<br>
	 * <br>
	 * For Example: superBlock("hooopplla") → 3 <br>
	 * superBlock("abbCCCddDDDDeeEEE") → 4 <br>
	 * superBlock("abbCCCCC")) → 5 <br>
	 * superBlock("") → 0 <br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */
	public int superBlock(String input) {
		return -1;
	}

	/**
	 * Given a string - return the number of times "am" appears in the String
	 * ignoring case - BUT ONLY WHEN the word "am" appears without being followed or
	 * preceded by other letters <br>
	 * <br>
	 * For Example: <br>
	 * amISearch("Am I in Amsterdam") → 1 <br>
	 * amISearch("I am in Amsterdam am I?") → 2 <br>
	 * amISearch("I have been in Amsterdam") → 0 <br>
	 * <br>
	 * HINT: String.toLowerCase
	 */
	public int amISearch(String sentence) {
		return -1;
	}

	/**
	 * Given a number if this number is divisible by 3 return "fizz" if this number
	 * is divisible by 5 return "buzz" if this number is divisible by both 3 and 5
	 * return "fizzbuzz" if this number is not divisible by 3 or 5 return null<br>
	 * <br>
	 * For Example: <br>
	 * fizzBuzz(3) → "fizz" <br>
	 * fizzBuzz(10) → "buzz" <br>
	 * fizzBuzz(15) → "fizzbuzz" <br>
	 * fizzBuzz(8) → null
	 */
	public String fizzBuzz(int number) {

		String answer;
		if (number % 3 == 0) {
			if (number % 3 == 0 && number % 5 == 0) {
				answer = "fizzbuzz";
			} else {
				answer = "fizz";
			}
		} 
		else if (number % 5 == 0) {
			answer = "buzz";
		} 
		else {
			answer = null;
		}

		return answer;
	}

	/**
	 * Given a string, split the string into the individual numbers present then add
	 * each digit of each number to get a final value for each number <br>
	 * <br>
	 * String example = "55 72 86"<br>
	 * <br>
	 * "55" will = the integer 10 <br>
	 * "72" will = the integer 9 <br>
	 * "86" will = the integer 14 <br>
	 * <br>
	 * You then need to return the highest vale <br>
	 * <br>
	 * For Example: <br>
	 * largest("55 72 86") → 14 <br>
	 * largest("15 72 80 164") → 11 <br>
	 * largest("555 72 86 45 10") → 15 <br>
	 * <br>
	 * HINT: Integer.parseInt
	 */
//	Split the string into three substrings
//	 int num1 = substring1.parseInt num1 = "55" 55

//	String substr1 = input.substring(0,1);
//	While the index value of the string isnot null if the index value isnot null make it an integer
//	Switch case that iterrates through each index of the string until an index.value is null.
//Then break, next case.
	
	public int largest(String input) {
//		String substr1 = input.substring(0,1);
//		int num1 = Integer.parseInt(substr1);
//		int num2;
//		int num3;
//		int num4;
//		int num5;
//		
//		if(num1< 10 || num1 > 99) {
//			return 0;
//		}
//		int sum =0;
//		
//		while(num1 >= 10) {
//			num1-= 10; /*num1 = num1-10, this formula repeats as long as num1 is bigger or equal to 10*/
//			sum++; /*Increment sum every iteration*/ 
//		}
//		
//		while(num1 >= 1) {
//			num1-= 1; /*num1 = num1 - 1*/
//			sum++;
//		}
////		return sum;
		return -1;
	}
//	public static void main(String[] args) {
//		method1("find the spaces");
//		}
//		public static void method1(String input) {
//		int spaces=0;
//		for (int i=0; i<input.length(); i++) {
//		if (input.substring(i, i+1).equals(" ") || i==(input.length()-1)) {
//		spaces++;
//		}
//		}
//		System.out.println("The word count is "+ spaces);
//		}

	/**
	 * Given a string, int and a char, return a boolean value if the 'nth'
	 * (represented by the int provided) char of the String supplied is the same as
	 * the char supplied. The int provided will NOT always be less than than the
	 * length of the String. Ignore case and Whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * compares("The",2,'h') → true <br>
	 * compares("AAbb",1,'b') → false <br>
	 * compares("Hi-There",10,'e') → false <br>
	 * <br>
	 * HINT: String.charAt
	 */
	public boolean compares(String word, int index, char letter) {
		return false;
	}
}
