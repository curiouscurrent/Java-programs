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
import java.awt.event.*;

public class prog2 extends JFrame implements ActionListener {
  private JButton button;

  public prog2() {
    setTitle("Button Frame");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    button = new JButton("Click me");
    button.addActionListener(this);
    add(button);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      JOptionPane.showMessageDialog(this, "Button was clicked!");
    }
  }

  public static void main(String[] args) {
    prog2 frame = new prog2();
    frame.setVisible(true);
  }
}