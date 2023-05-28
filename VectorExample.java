/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
//vector

import java.util.*;
public class VectorExample
{

	public static void main(String[] args) 
	{
		Vector fruits = new Vector();
		fruits.add("Apple");
		fruits.add("Strawberry");
		fruits.add("Pineapple");
		System.out.println(fruits);
		for(Iterator it = fruits.iterator(); it.hasNext();)
			System.out.println(it.next());
			fruits.setElementAt("Melon", 1);
			System.out.println(fruits);
			

	}
}
