package com.N_Numbers_Calculator;

import java.util.Scanner;

public class User_Data_Input 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		
		Calc_Addition addition = new Calc_Addition();
		Calc_Substraction sub = new Calc_Substraction();
		Calc_Multiplication multi = new Calc_Multiplication();
		Calc_Division div = new Calc_Division();
		int ans;
		
		do {
		System.out.println("Enter the operator for operation(+,-,*,/)");
		String operator = input.next();
		System.out.println("performing calculation for 'n' numbers : ");
		System.out.println("enter number of  numbers to be used for operation : ");
		int size = input.nextInt();
		float array[] = new float[size];
		float result;
		System.out.println("Enter the numbers for operation : ");
		for (int index = 0; index < size; index++) {
			array[index] = input.nextFloat();
			}
		switch (operator) {
		case "+": {
			result = addition.add(array);
			System.out.println("Addition of all numbers " + result);
		break;
		}
		case "-": {
			result = sub.substraction(array);
			System.out.println("Substraction of all numbers " + result);
		break;
		}
		case "*": {
			result = multi.multiplication(array);
			System.out.println("multiplication of all numbers " + result);
		break;
		}
		case "/": {
			try {
				result = div.division(array);
				System.out.println("Divison of all numbers  is " + result);
			}catch (ArithmeticException E)
			{
				System.out.println("No division by zero ");
			}
		break;
	}

	}
		System.out.println("Do you want to Continue press 1 or press 0 to exit : ");
		ans = input.nextInt();
		}
		while(ans == 1);

	}
}
