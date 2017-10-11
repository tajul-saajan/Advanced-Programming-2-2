package com.example.java;

import java.util.Scanner;

public class Main{
	
	public static void main(String args[]) {
		int a = 0,b=0,c=0,z=0;
		System.out.println("Select an action : 1.Alzebra\n2.Geometry\n\n");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		z=scanner.nextInt();
		if (z==1) {

			System.out.print("Select an operation : 1.Addition\n2.Subtraction\n" +
					"3.Multiplication\n4.Division\n5.Exponent \n6.Square Root\n");
			c=scanner.nextInt();
			My_Calculation demo = new My_Calculation();
			if(c==1)demo.addition(a, b);
            else if(c==2)demo.Substraction(a, b);
            else if(c==3)demo.multiplication(a, b);
            else if(c==4)demo.division(a, b);
			else if(c==5)demo.exponent(a,b);
			else if (c==6)demo.squareRoot(a);
            else System.out.println("\nInvalid selection\n");
		}
		else if(z==2){
			System.out.println("Select  : 1.sin()\n2.cos()\n3.tan() \n\n");
			a=scanner.nextInt();
			Geometric_Class geometric_class=new Geometric_Class();

			double k;
			System.out.print("Enter the Degree of angle: ");
			k=scanner.nextDouble();
			if (a==1) {

				geometric_class.getSin(k);
			}
			else if (a==2) {

				geometric_class.getCos(k);
			}
			else if (a==3) {

				geometric_class.getTan(k);
			}
		}
	}
	
}