/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
class Point{
void show(){
System.out.println("This is the Point Base class");
}
}
class Shape extends Point{
void display(){
System.out.println("Different shapes can be developed with different number of points");
}
}
class Rectangle extends Shape{
int l,b;
void getdata(int x,int y){
l=x;b=y;
}
void area(){
System.out.println("Length:"+l);
System.out.println("Breadth:"+b);
System.out.println("Area:"+(l*b));
}
void display(){
System.out.println("Rectangle Class");
}
}
class Square extends Shape{
int a;
void gdata(int x){
a=x;
}
void area(){
System.out.println("Side:"+a);
System.out.println("Area:"+(a*a));
}
void display(){
System.out.println("Square Class");
}
}
class Circle extends Shape{
int r;
void get(int x){
r=x;
}
void area(){
System.out.println("Radius:"+r);
System.out.println("Area:"+(3.14*r*r));
}
void display(){
System.out.println("Circle Class");
}
}
class Triangle extends Shape{
int b,h;
void tdata(int x,int y){
b=x;h=y;
}
void area(){
System.out.println("Base:"+b);
System.out.println("Height:"+h);
System.out.println("Area:"+(0.5*b*h));
}
void display(){
System.out.println("Triangle Class");
}
}

