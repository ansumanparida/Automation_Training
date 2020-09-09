package com.N_Numbers_Calculator;

public class Calc_Division {
	public float division(float[] array) throws Custom_Exception
	{
		float divide = array[0];
		for (int index = 1; index < array.length; index++) 
		{
			divide = divide / array[index];
		}
		if (divide <= 0) throw new Custom_Exception ("No Division By Zero");
		return divide;

}
}