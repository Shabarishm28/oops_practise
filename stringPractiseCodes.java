package oopsPractise;

import java.util.HashMap;
import java.util.Map;

public class stringPractiseCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/***********************************************************
		 * String Reverse
		 *********************/
		String test = "Good morning";
		String test1 = "";
		String test2 = "";
		char ch, ch1;

		for (int i = 0; i <= test.length() - 1; i++) {

			ch = test.charAt(i);
			test1 = ch + test1;
		}
		System.out.println("The reversed string is " + test1);

		for (int j = test.length() - 1; j >= 0; j--) {

			ch1 = test.charAt(j);
			test2 = test2 + ch1;
		}
		System.out.println("The reversed string is " + test2);

		/*************************************
		 * Lower to upper and vice versa
		 *********************/

		StringBuffer updatedString = new StringBuffer(test);

		for (int k = 0; k < test.length(); k++) {
			if (Character.isUpperCase(test.charAt(k))) {
				updatedString.setCharAt(k, Character.toLowerCase(test.charAt(k)));
			}
			if (Character.isLowerCase(test.charAt(k))) {

				updatedString.setCharAt(k, Character.toUpperCase(test.charAt(k)));
			}
		}
		System.out.println("The converted string is " + updatedString);

		/***************************************************************
		 * differentiate number and character
		 ***********************/

		String testValue = "123Abc112Strd";
		StringBuffer num = new StringBuffer();
		StringBuffer text = new StringBuffer();

		for (int x = 0; x < testValue.length(); x++) {
			if (Character.isDigit(testValue.charAt(x))) {
				num.append(testValue.charAt(x));
			} else if (Character.isAlphabetic(testValue.charAt(x))) {
				text.append(testValue.charAt(x));
			}

		}

		System.out.println("The numbers are " + num);
		System.out.println("The text value is " + text);

		/***********************************************************
		 * find character count
		 ***********************/

		String Sentence = "This is a test statement";
		HashMap<Character, Integer> hs = new HashMap<>();
		Sentence = Sentence.toLowerCase();
		for (char c : Sentence.toCharArray()) {
			if (c == ' ') {
				continue;
			} else if (hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);
			} else {
				hs.put(c, 1);
			}
		}
		int max = 0;
		int min = 255;
		char maxChar = ' ';
		char minChar = ' ';

		for (Map.Entry<Character, Integer> countValue : hs.entrySet()) {
			System.out.println("The character " + countValue.getKey() + " is observed for " + countValue.getValue());

			char charValue = countValue.getKey();
			int count = countValue.getValue();

			if (max < count) {
				max = count;
				maxChar = charValue;
			}

			if (min > count) {
				min = count;
				minChar = charValue;
			}
		}
		System.out.println("The max char is " + maxChar + " for " + max + " times");
		System.out.println("The max char is " + minChar + " for " + min + " times");

		/************************************************
		 * Palindrome
		 ********************************************************/

		String testPalindrome = "test";
		testPalindrome = testPalindrome.toLowerCase();

		int left = 0;
		int right = testPalindrome.length() - 1;
		boolean isPalindrome = true;

		while (left < right) {

			if (testPalindrome.charAt(left) != testPalindrome.charAt(right)) {
				System.out.println("The string is not palindrome");
				isPalindrome = false;
				break;
			}
			left++;
			right--;
		}

		if (isPalindrome) {
			System.out.println("The string is palindrome");
		}

		/************************************************
		 * String Swap
		 ********************************************************/

		String s1 = "Good", s2 = "Morning";
		s1 = s1 + s2;

		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("The values before swapping " + s1 + " " + s2);
		System.out.println("The swapped values are " + s1 + " " + s2);

		/************************************************
		 * String split
		 ********************************************************/

		String teststatement = "This is a test statement";
		String[] val = teststatement.split(" ");

		for (String s : val) {
			System.out.println(s);

		}
	

	/************************************************
	 * Fabonacci series
	 ********************************************************/
		
		int length = 10;
		int temp1 = 0;
		int temp2 = 1;
		int result = 0;
		
		for(int i=0; i<=length; i++) {
			
			result = temp1+temp2;
			temp2 = temp1;
			temp1 = result;
			
			System.out.println(result);
		}
		
	}
	}
