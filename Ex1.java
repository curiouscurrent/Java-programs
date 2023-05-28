/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
import java.util.Scanner;

class Ex1
{  
	public static void main(String arg[])
    {  
		try
		{
			// declare and initialize here.
			int a,b,c;
			Scanner KB=new Scanner(System.in);
			
			// input numbers here.
			System.out.print("Enter first number : ");
			a=KB.nextInt();
       
			System.out.print("Enter second number : ");
			b=KB.nextInt();
       
			//throw to catch
			c=a/b;
			System.out.println("Result:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
		}
		// here program ends.
		System.out.println("End of Program...");
	}
}