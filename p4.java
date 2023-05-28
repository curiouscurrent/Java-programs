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

public class p4 extends JFrame {
  private JComboBox<String> comboBox;
  private JLabel label;

  public p4() {
    setTitle("Combo Box Frame");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    String[] choices = {"Item 1", "Item 2", "Item 3", "Item 4"};
    comboBox = new JComboBox<>(choices);
    comboBox.addActionListener(e -> {
      String selection = (String) comboBox.getSelectedItem() + " selected ";
      label.setText(selection);
    });
    add(comboBox);

    label = new JLabel();
    add(label);
  }

  public static void main(String[] args) {
    p4 frame = new p4();
    frame.setVisible(true);
  }
}
