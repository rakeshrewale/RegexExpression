package com.RegexExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexExpression {

	static boolean validate(String pattern, String text) {
		return Pattern.compile(pattern).matcher(text).matches();
	}

	public static void main(String[] args) {

		String pattern = "^[A-Z]{1}[A-Za-z]{2,}$";

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please Enter Last name:=");

		String lastName = scanner.next();

		boolean isValid = validate(pattern, lastName);

		if (isValid) {
			System.out.println("This is valid last name .");
		} else {
			System.out.println("Not a valid name");
		}
	}

}
