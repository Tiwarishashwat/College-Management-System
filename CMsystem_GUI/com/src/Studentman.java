package bin;
import bin.VStudent;
import bin.AStudent;
import bin.DStudent;
import java.sql.*;
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class Studentman extends Frame {
 JButton b15,b16,b17;              
 public Studentman()
 {
  JFrame f9=new JFrame("Library Management System");
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
          VStudent obj1=new VStudent();
     }
    });
    b16.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
     {
       AStudent obj2=new AStudent();
     }
    });
    b17.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
     {
        DStudent obj3=new DStudent();
     }
    });
  f9.add(b15);
  f9.add(b16);
  f9.add(b17);
  f9.setSize(400,400);  
  f9.setLayout(null);
  f9.setVisible(true);
 }
}
   