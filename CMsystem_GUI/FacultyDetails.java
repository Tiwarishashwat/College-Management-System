import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class FacultyDetails extends Frame
{
 JLabel l4,l5;
 JTextField tf2;
 JButton b6;
 public FacultyDetails()
 {
  JFrame f2=new JFrame("College Management System");
  l4=new JLabel("Faculty Details");
  l4.setBounds(110,50,200,60);
  l5=new JLabel("Enter ID");
  l5.setBounds(30,100,100,30);
  tf2=new JTextField();
  tf2.setBounds(120,100,170,30);
  JButton b6=new JButton("Search");
  b6.setBounds(80,150, 170,30);
    f2.add(l4);
    f2.add(l5);
    f2.add(tf2);
    f2.add(b6);
    f2.setSize(400,400);  
    f2.setLayout(null);  
    f2.setVisible(true);
 }
}