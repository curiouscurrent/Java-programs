/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
import java.util.Scanner;
import java.util.*;
public class student
{
 String USN;
 String NAME;
 String BRANCH;
 int SEM;
public student(String usn,String name,String branch,int sem)
{
 USN=usn;
 NAME=name;
 BRANCH=branch;
 SEM=sem;
}
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number of students");
 int n = sc.nextInt();
 student st[] = new student[n];
 String usn,name,branch; int sem;
 for(int i=0;i<n;i++)
 {
 System.out.println("Enter the details of the students"+(i+1));
 System.out.println("Enter the USN");
 usn = sc.next();
 System.out.println("Enter the Name");
 name = sc.next();
 System.out.println("Enter the Branch");
 branch = sc.next();
 System.out.println("Enter the SEM");
 sem = sc.nextInt();
 st[i] = new student(usn,name,branch,sem);
 System.out.println("Student details");
 System.out.println("USN\tNAME\tBRANCH\tSEMSTER\t");
 }
 for(int i=0;i<n;i++)
 {
      System.out.println(st[i].USN + "\t" + st[i].NAME + "\t" + st[i].BRANCH + "\t"
      + st[i].SEM);
 }
 }}
