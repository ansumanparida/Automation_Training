package com.N_Numbers_Calculator;

public class Calc_Multiplication 
{
	public float multiplication(float[] array) 
	{
		float multiply = 1;
		for (int index = 0; index < array.length; index++) 
		{
			multiply = multiply * array[index];
		}
		return multiply;

}
}