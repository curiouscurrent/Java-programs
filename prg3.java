/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;
import java.util.*;

/**
 *
 * @author Anusha
 */
public class prg3 {
    public static void main(String[] args) {
Hashtable<Integer,String> h = new Hashtable<Integer,String>();
h.put(1, "Sunday");
h.put(2, "Monday");
h.put(3, "Tuesday");
Enumeration e = h.elements();
while(e.hasMoreElements()) {
System.out.println(e.nextElement());
}
}
}
