package com.example.java;

import java.util.Scanner;

public class Main{
	
	public static void main(String args[]) {
		int a, b,c;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		a=scanner.nextInt();
		System.out.print("Enter the second number : ");
		b=scanner.nextInt();
		System.out.print("Select an operation : 1.Addition\n2.Subtraction\n3.Multiplication\n4.Division : ");
		c=scanner.nextInt();
		My_Calculation demo = new My_Calculation();
		if(c==1)demo.addition(a, b);
		else if(c==2)demo.Substraction(a, b);
		else if(c==3)demo.multiplication(a, b);
		else if(c==4)demo.division(a, b);
		else System.out.println("\nInvalid selection\n");
	}
	
}