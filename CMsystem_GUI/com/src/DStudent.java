package bin;
import java.sql.*;
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class DStudent extends Frame implements ActionListener {
JLabel l19;
JTextField tf6;
JButton b17;
public DStudent()
{
 JFrame f11=new JFrame("Library Management System");
 l19=new JLabel("Enter sap id");
  l19.setBounds(110,20, 200,30);
  tf6=new JTextField();
  tf6.setBounds(50,50, 250,30);
  b17=new JButton("Delete");
  b17.setBounds(130,100, 100,30);
  b17.addActionListener(this);
  f11.add(l19);
  f11.add(tf6);
  f11.add(b17);
  f11.setSize(400,400);  
  f11.setLayout(null);
  f11.setVisible(true);
}
public void actionPerformed(ActionEvent e)
     {
      String sap=tf6.getText();
       try
      {
       Class.forName("com.mysql.jdbc.Driver");
       Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagementsystem","root","Stiwari1999");
       Statement stmt=Con.createStatement();
       int x=stmt.executeUpdate("DELETE from student where sapid='"+sap+"'");
       if(x==1)
       {
         JOptionPane.showMessageDialog(b17,"record deleted");
         x=0;
       }
       else
       {
         JOptionPane.showMessageDialog(b17,"student not found");
       }
       Con.close(); 
      }catch(Exception ex){System.out.println("unknown error");}    
     }
}