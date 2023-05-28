/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
import javax.swing.*;
import java.awt.*;

public class p1 extends JFrame {
  public p1() {
    setTitle("Button Frame");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    JButton button1 = new JButton("Button 1");
    add(button1);

    JButton button2 = new JButton("Button 2");
    add(button2);

    JTextField textField = new JTextField(10);
    add(textField);
  }

  public static void main(String[] args) {
    p1 frame = new p1();
    frame.setVisible(true);
  }
}