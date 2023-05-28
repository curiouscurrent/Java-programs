/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
class ShapeTest{
public static void main(String args[]){
Rectangle r = new Rectangle();
Square s = new Square();
Circle c = new Circle();
Triangle t = new Triangle();
r.show();
s.display();
System.out.println("Rectangle:");
System.out.println();
r.getdata(12,6);
r.area();
System.out.println("");
System.out.println("Square:");
System.out.println();
s.gdata(7);
s.area();
System.out.println("");
System.out.println("Circle:");
System.out.println();
c.get(5);
c.area();
System.out.println("");
System.out.println("Triangle:");
System.out.println();
t.tdata(4,7);
t.area();
/*Dynamic polymorphism in Java refers to the process 
when a call to an overridden process is resolved at the run time. 
The reference variable of a superclass calls the overridden method.*/
System.out.println("Dynamic Polymorphism");
Shape sh;
sh=new Rectangle();
sh.display();
sh=new Triangle();
sh.display();
}
}
