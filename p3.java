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

public class p3 extends JFrame {
  private JTextField textField1;
  private JTextField textField2;
  private JTextArea textArea;

  public p3() {
    setTitle("Text Field Frame");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    textField1 = new JTextField(10);
    textField1.setEditable(true);
    add(textField1);

    textField2 = new JTextField(10);
    textField2.setEditable(true);
    add(textField2);

    textArea = new JTextArea(5, 20);
    textArea.setEditable(true);
    add(textArea);
  }

  public static void main(String[] args) {
    p3 frame = new p3();
    frame.setVisible(true);
  }
}

