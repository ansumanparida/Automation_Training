package com.N_Numbers_Calculator;

public class Calc_Substraction {
	public float substraction(float[] array) 
	{
		float substract = array[0];
		for (int index = 1; index < array.length; index++) 
		{
			substract = substract - array[index];
		}
		return substract;
	}

}
