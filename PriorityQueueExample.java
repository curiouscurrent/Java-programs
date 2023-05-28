/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;
import java.util.PriorityQueue;

/**
 *
 * @author Anusha
 */
public class PriorityQueueExample 
{
public static void main(String[] args)
{
PriorityQueue numbers = new PriorityQueue();
numbers.add("Red");
numbers.add("Green");
System.out.println("PriorityQueue: " + numbers);
numbers.offer("Apricot");
System.out.println("Updated Pripority Queue: " + numbers);
System.out.println(numbers.peek());
System.out.println(numbers.poll());
System.out.println(numbers.poll());
}
}

