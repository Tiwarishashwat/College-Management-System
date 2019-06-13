import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class StudentDetails extends Frame
{
 public StudentDetails()
 {
  JLabel l2,l3;
  JTextField tf1;
  JFrame f1=new JFrame("College Management System");
  l2=new JLabel("Student Details");
  l2.setBounds(110,50,200,60);
  l3=new JLabel("Enter Sap ID");
  l3.setBounds(30,100,100,30);
  tf1=new JTextField();
  tf1.setBounds(120,100,170,30);
  JButton b5=new JButton("Search");
  b5.setBounds(80,150, 170,30);
    f1.add(l2);
    f1.add(l3);
    f1.add(tf1);
    f1.add(b5);
    f1.setSize(400,400);  
    f1.setLayout(null);  
    f1.setVisible(true);
 }
}