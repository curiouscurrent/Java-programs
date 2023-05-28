/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
import java.io.*;
import java.util.Enumeration;
import java.util.Hashtable;
  
// Main class
// EnumerationOnKeys
public class GFG {
  
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an empty hashtable
        Hashtable<Integer, String> ht
            = new Hashtable<Integer, String>();
  
        // Inserting key-value pairs into hash table
        // using put() method
        ht.put(1, "for");
        ht.put(2, "geeks");
        ht.put(3, "G");
  
        // Now creating an Enumeration object
        //  to read elements
        Enumeration e = ht.elements();
  
        // Condition holds true till there is
        // single key remaining
  
        // Printing elements of hashtable
        // using enumeration
        while (e.hasMoreElements()) {
  
            // Printing the current element
            System.out.println(e.nextElement());
        }
    }
}