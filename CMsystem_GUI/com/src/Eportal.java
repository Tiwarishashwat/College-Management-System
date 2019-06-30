package bin;
import bin.StudentLogin;
import bin.FacultyLogin;
import bin.AdminLogin;
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class Eportal extends Frame 
{
 public Eportal()
 {
  JLabel l7,l8;           //label-declaration
 JButton b8,b9,b10;  //Button-declaration
  JFrame f4=new JFrame("College Management System");
  l7=new JLabel("E-PORTAL");   //heading
  l7.setBounds(110,20, 200,30);
  l8=new JLabel();   
  l8.setBounds(30,250,100,30);
  b8=new JButton("Student Login");      //navigations
  b9=new JButton("Faculty Login");     //navigations
  b10=new JButton("Admin Login");      //navigations
   b8.setBounds(80,70, 170,30);
   b9.setBounds(80,120, 170,30); 
   b10.setBounds(80,170, 170,30);
   b8.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
     {
        StudentLogin obj5=new StudentLogin();  
     }
    });
   b9.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
     {
        FacultyLogin obj6=new FacultyLogin();  
     }
    });
   b10.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
     {
        AdminLogin obj7=new AdminLogin();  
     }
    });
   f4.add(l7);
   f4.add(l8);
   f4.add(b8);
   f4.add(b9);
   f4.add(b10);
   f4.setSize(400,400);  
   f4.setLayout(null);  
   f4.setVisible(true);
 }

}