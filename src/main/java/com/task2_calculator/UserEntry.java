package com.task2_calculator;

import java.util.Scanner;

public class UserEntry 
{

	public static void main(String[] args) 
	{

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		Addition addition = new Addition();
		Substraction sub = new Substraction();
		Multiplication multi = new Multiplication();
		Divisional div = new Divisional();
		
		System.out.println("Enter First number for calculation : ");
		float firstNumber = input.nextFloat();
		System.out.println("Enter Second number for calculation : ");
		float secondNumber = input.nextFloat();
		float result;

		System.out.println("Enter your operator(+, -, * or /)");
		String sign = input.next();

		if (sign.equals("+")) {
			result = addition.add(firstNumber, secondNumber);
			System.out.println("Addition of two numbers is : " + result);
		} else if (sign.equals("-")) {
			result = sub.substraction(firstNumber, secondNumber);
			System.out.println("substraction of two numbers is : " + result);
		} else if (sign.equals("*")) {
			result = multi.multiplication(firstNumber, secondNumber);
			System.out.println("Multiplication of two number is : " + result);
		} else if (sign.equals("/")) {
			try {
				result = div.division(firstNumber, secondNumber);
				System.out.println("Divison of two number  is : " + result);
			} catch (ArithmeticException e) {
				System.out.println("No division by zero please");
			}
		} else {
			System.out.println("Invalid sign");
		}

		
	}

}
