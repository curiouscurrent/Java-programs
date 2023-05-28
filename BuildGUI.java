/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    
class BuildGUI extends JFrame implements ActionListener {
        JFrame actualWindow;
        JPanel container;
        JTextField txt_num1, txt_num2, txt_result;
        JButton btn_div;
        JLabel x,y,z;
        
        BuildGUI() {
            actualWindow = new JFrame("Division");
            container = new JPanel();
            container.setLayout(new FlowLayout());
            
            txt_num1 = new JTextField(20);
            txt_num2 = new JTextField(20);
            txt_result = new JTextField(20);
            
            x=new JLabel("Num 1:");
            y=new JLabel("Num 2:");
            z=new JLabel("Result:");
            
            btn_div = new JButton("Divide");
            btn_div.addActionListener(this);
            
            container.add(x);
            container.add(txt_num1);
            container.add(y);
            container.add(txt_num2);
            container.add(btn_div);
            container.add(z);
            container.add(txt_result);
            
            actualWindow.add(container);
            actualWindow.setSize(300, 300);
            actualWindow.setVisible(true);
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            int num1, num2;
            try {
                num1 = Integer.parseInt(txt_num1.getText());
                num2 = Integer.parseInt(txt_num2.getText());
                txt_result.setText(num1/num2+"");
            }
            catch(NumberFormatException nfe) {
                JOptionPane.showMessageDialog(actualWindow,"Please do enter only integers");  
            }
            catch(ArithmeticException ae) {
                JOptionPane.showMessageDialog(actualWindow,"Divisor can not be ZERO");  
            }
        }
    public static void main(String[] args)
    {
        new BuildGUI();
    }
}
