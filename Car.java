/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
public class Car extends Vehicle {
 public static void main(String args[])
 {
 Vehicle obj=new Vehicle();
 obj.setter("Avik","KA022");
 System.out.println("Name="+obj.getName());
 System.out.println("Car license no="+obj.getLicense());
 }
}