package com.example.java;

class Calculation {
	int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers:" + z);
	}

	public void Substraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers:" + z);
	}
}

public class My_Calculation extends Calculation {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers:" + z);
	}

	public void division(int x,int y) {
		z=x/y;
		System.out.println("The value of "+x+"/"+y+" is "+z);
		
	}
}