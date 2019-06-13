import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class Facultyman extends Frame {
 JLabel l20;
 JTextField tf7;
 JButton b14;               //label-declaration
public Facultyman()
 {
  JFrame f10=new JFrame("Library Management System");
  l20=new JLabel("Enter id");
  l20.setBounds(110,20, 200,30);
  tf7=new JTextField();
  tf7.setBounds(50,50, 200,30);
  f10.add(l20);
  f10.add(tf7);
  f10.setSize(400,400);  
  f10.setLayout(null);
  f10.setVisible(true);
 }
}