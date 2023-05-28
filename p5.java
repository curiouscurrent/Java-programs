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

public class p5 extends JFrame implements ActionListener {
 private JList<String> list;
 private JPopupMenu popupMenu;
 private JMenuItem menuItem;
 public p5() {
 setTitle("List Frame");
 setSize(400, 300);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(new FlowLayout());
 String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
 list = new JList<>(items);
 list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
 list.addMouseListener(new MouseAdapter() {
 public void mouseClicked(MouseEvent e) {
 if (e.getButton() == MouseEvent.BUTTON3) {
 popupMenu.show(list, e.getX(), e.getY());
 }
 }
 });
 add(new JScrollPane(list));
 popupMenu = new JPopupMenu();
 menuItem = new JMenuItem("Display message");
 menuItem.addActionListener(this);
 popupMenu.add(menuItem);
 }
 public void actionPerformed(ActionEvent e) {
 if (e.getSource() == menuItem) {
 int[] indices = list.getSelectedIndices();
 StringBuilder sb = new StringBuilder();
 for (int index : indices) {
 sb.append(list.getModel().getElementAt(index)).append(" ");
 }
 JOptionPane.showMessageDialog(this, "Selected items: " + sb.toString());
 }
 }
 public static void main(String[] args) {
 p5 frame = new p5();
 frame.setVisible(true);
 }
 }


