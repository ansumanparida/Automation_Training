package com.N_Numbers_Calculator;

public class Calc_Addition {
	public float add(float[] array) 
	{
		float sum = 0;
		for (int index = 0; index < array.length; index++) 
		{
			sum = sum + array[index];
		}
		return sum;
	}
}
