package bin;
import bin.VFaculty;
import bin.AFaculty;
import bin.DFaculty;
import java.sql.*;
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class Facultyman extends Frame {
 JLabel l20;
 JTextField tf7;
 JButton b15,b16,b17;                //label-declaration
public Facultyman()
 {
  JFrame f10=new JFrame("Library Management System");
   b15=new JButton("View");
  b16=new JButton("Add");
  b17=new JButton("Delete");
   b15.setBounds(130,100, 100,30);
  b16.setBounds(130,150, 100,30);
  b17.setBounds(130,200, 100,30);
  b15.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
     {
          VFaculty obj1=new VFaculty();
     }
    });
    b16.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
     {
       AFaculty obj2=new AFaculty();
     }
    });
    b17.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
     {
       DFaculty obj3=new DFaculty();
     }
    });
  f10.add(b15);
  f10.add(b16);
  f10.add(b17);
  f10.setSize(400,400);  
  f10.setLayout(null);
  f10.setVisible(true);
 }
}


         