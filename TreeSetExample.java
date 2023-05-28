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
public class TreeSetExample 
{
public static void main(String[] args)
{
TreeSet ts = new TreeSet();
ts.add("Red");
ts.add("Green");
ts.add("Blue");
for(Iterator t = ts.iterator();t.hasNext();)
{
System.out.println(t.next());
}
}
}
