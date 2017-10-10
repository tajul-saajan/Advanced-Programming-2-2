package com.example.java;

class Calculation {
	int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("\nThe sum of the given numbers:" + z);
	}

	public void Substraction(int x, int y) {
		z = x - y;
		System.out.println("\nThe difference between the given numbers:" + z);
	}
}

public class My_Calculation extends Calculation {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("\nThe product of the given numbers:" + z);
	}

	public void division(int x,int y) {
		z=x/y;
		System.out.println("\nThe value of "+x+"/"+y+" is "+z);
		
	}
}