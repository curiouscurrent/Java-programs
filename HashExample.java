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
public class HashExample
{
public static void main(String[] args) 
{
HashSet hs = new HashSet();



hs.add("My");
hs.add("name");
hs.add("is");
hs.add("nirupama");

for (Object obj : hs) {
    System.out.println(obj + ": " + obj.hashCode());
}


}
}
