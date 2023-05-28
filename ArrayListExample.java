/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
import java.util.*;
public class ArrayListExample 
{
public static void main(String[] args) 
{
ArrayList arraylist1 = new ArrayList(4);
arraylist1.add("Voilet");
arraylist1.add("Indigo");
arraylist1.add("Blue");
arraylist1.add("Green");
arraylist1.add("Green");
ArrayList arraylist2 = new ArrayList(arraylist1);
ArrayList arraylist = new ArrayList();
arraylist.add("Yellow");
arraylist.add("Orange");
arraylist.add("Red");
System.out.println(arraylist2);
System.out.println(arraylist);
}
}
