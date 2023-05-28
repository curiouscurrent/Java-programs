/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample 
{
public static void main(String[] args) 
{
LinkedList link = new LinkedList();
link.addFirst("January");
link.addFirst("February");
link.addFirst("March");
link.addLast("May");
link.addLast("June");
System.out.println("The elements of the linked list are :"+link);
System.out.println("The elements of the linked list are :"+link.getFirst());
System.out.println("The elements of the linked list are :"+link.getLast());
System.out.println("The elements of the linked list are :"+link.removeFirst());
System.out.println("The elements of the linked list are :"+link);
for(Iterator i = link.iterator();i.hasNext();)
{
System.out.println(i.next());
}
}
}


