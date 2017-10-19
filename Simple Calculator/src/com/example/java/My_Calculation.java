package com.example.java;

import java.util.Scanner;

class Calculation {
	int z;
	Scanner scanner=new Scanner(System.in);

	public void addition(int x, int y) {
		System.out.print("Enter the first number : ");
		x=scanner.nextInt();
		System.out.print("Enter the second number : ");
		y=scanner.nextInt();
		z = x + y;
		System.out.println("\nThe sum of the given numbers:" + z);
	}

	public void Substraction(int x, int y) {
		System.out.print("Enter the first number : ");
		x=scanner.nextInt();
		System.out.print("Enter the second number : ");
		y=scanner.nextInt();
		z = x - y;
		System.out.println("\nThe difference between the given numbers:" + z);
	}
}

public class My_Calculation extends Calculation {
	public void multiplication(int x, int y) {
		System.out.print("Enter the first number : ");
		x=scanner.nextInt();
		System.out.print("Enter the second number : ");
		y=scanner.nextInt();
		z = x * y;
		System.out.println("\nThe product of the given numbers:" + z);
	}

	public void division(int x,int y) {
		System.out.print("Enter the first number : ");
		x=scanner.nextInt();
		System.out.print("Enter the second number : ");
		y=scanner.nextInt();
		z=x/y;
		System.out.println("\nThe value of "+x+"/"+y+" is "+z);
		
	}
	public void exponent(int x,int y){

		z=(int) Math.pow(x,y);
		System.out.println("\nThe value of "+x+"/"+y+" is "+z);
	}
	public void squareRoot(int x){
		System.out.print("Enter the number : ");
		x=scanner.nextInt();
		double kk = Math.sqrt(x);
		System.out.println("\nThe value of Square Root of "+x+" is "+kk);
	}
}