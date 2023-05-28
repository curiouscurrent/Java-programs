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

public class ListPopupMenuExample extends JFrame implements ActionListener {
    private JList<String> list;
    private JPopupMenu popupMenu;

    public ListPopupMenuExample() {
        setTitle("List Popup Menu Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the list of items
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        list = new JList<>(items);

        // Create the popup menu and add a menu item
        popupMenu = new JPopupMenu();
        JMenuItem messageItem = new JMenuItem("Display Message");
        messageItem.addActionListener(this);
        popupMenu.add(messageItem);

        // Add the list to a scroll pane
        JScrollPane scrollPane = new JScrollPane(list);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Add a mouse listener to show the popup menu
        list.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                showPopup(e);
            }

            public void mouseReleased(MouseEvent e) {
                showPopup(e);
            }

            private void showPopup(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        // Set the window size and show the frame
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Handle the menu item click event
    public void actionPerformed(ActionEvent e) {
        // Get the selected items from the list
        int[] selectedIndices = list.getSelectedIndices();
        if (selectedIndices.length > 0) {
            String selectedItems = "";
            for (int i : selectedIndices) {
                selectedItems += list.getModel().getElementAt(i) + ", ";
            }
            selectedItems = selectedItems.substring(0, selectedItems.length() - 2); // Remove the last comma and space

            // Display the message with the selected items
            JOptionPane.showMessageDialog(this, "Selected items: " + selectedItems);
        } else {
            // Display an error message if no items are selected
            JOptionPane.showMessageDialog(this, "Please select one or more items from the list");
        }
    }

    public static void main(String[] args) {
        new ListPopupMenuExample();
    }
}

