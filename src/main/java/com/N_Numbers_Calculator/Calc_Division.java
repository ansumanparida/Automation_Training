package com.N_Numbers_Calculator;

public class Calc_Division {
	public float division(float[] array) 
	{
		float divide = array[0];
		for (int index = 1; index < array.length; index++) 
		{
			divide = divide / array[index];
		}
		return divide;

}
}