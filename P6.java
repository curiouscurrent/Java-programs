/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;

/**
 *
 * @author Anusha
 */
public class P6 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int num = scanner.nextInt();
 try {
 if (num < 10 || num > 50) {
 throw new OutOfRangeException("Number is out of range");
 }
 System.out.println("The square of the number is: " + num * num);
 } catch (OutOfRangeException e) {
 System.out.println(e.getMessage());
 }
 }
}

