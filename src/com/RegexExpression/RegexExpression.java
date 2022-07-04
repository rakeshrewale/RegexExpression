package com.RegexExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexExpression {

	static boolean validate(String pattern, String text) {
		return Pattern.compile(pattern).matcher(text).matches();
	}

	public static void main(String[] args) {

        String pattern  = "^(91)[-.+]{1}[1-9]{1}[0-9]{9}$";

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please Enter Last name:=");

		String lastName = scanner.next();

		boolean isValid = validate(pattern, lastName);

		if (isValid) {
			System.out.println("This is valid Email ID .");
		} else {
			System.out.println("Not a valid ID");
		}
	}

}