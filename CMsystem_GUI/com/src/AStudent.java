package bin;
import java.sql.*;
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class AStudent extends Frame implements ActionListener {
 JLabel l19,l21,l22,l23,l24,l25,l18;           //label-declaration
 JTextField tf6,tf7,tf8,tf9,tf10,tf11;
 JButton b16;
 JFrame f10=new JFrame("Library Management System");     
 public AStudent()
 {         
  l18=new JLabel("ADD STUDENT");
  l18.setBounds(100,50, 100,30);
  l19=new JLabel("Sap id");
  l19.setBounds(30,100, 100,30);
  tf6=new JTextField();
  tf6.setBounds(130,100, 100,30);
   l21=new JLabel("Name:");
   l21.setBounds(30,150,100,30);
   l22=new JLabel("RollNo:");
   l22.setBounds(30,200,100,30);
   l23=new JLabel("Branch:");
   l23.setBounds(30,250,100,30);
   l24=new JLabel("Year:");
   l24.setBounds(30,300,100,30);
   l25=new JLabel("Password:");
   l25.setBounds(30,350,100,30);
   tf7=new JTextField();
   tf7.setBounds(130,150,100,30);
   tf8=new JTextField();
   tf8.setBounds(130,200,100,30);
   tf9=new JTextField();
   tf9.setBounds(130,250,100,30);
   tf10=new JTextField();
   tf10.setBounds(130,300,100,30);
   tf11=new JTextField();
   tf11.setBounds(130,350,100,30);
   b16=new JButton("ADD");
   b16.setBounds(100,400,100,30);
   b16.addActionListener(this);
   f10.add(l18);
   f10.add(l19);
   f10.add(tf6);
   f10.add(l21);
   f10.add(l22);
   f10.add(l23);
   f10.add(l24);
   f10.add(l25);
   f10.add(tf7);
   f10.add(tf8);
   f10.add(tf9);
   f10.add(tf10);
   f10.add(tf11);
   f10.add(b16);
   f10.setSize(400,400);  
   f10.setLayout(null);
   f10.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  try
      {
        String sap=tf6.getText();
         String name=tf7.getText();
         String rollno=tf8.getText();
         String branch=tf9.getText();
         String year=tf10.getText();
         String pass=tf11.getText();
       Class.forName("com.mysql.jdbc.Driver");
       Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagementsystem","root","Stiwari1999");
       PreparedStatement pt=Con.prepareStatement("Insert into student(sapid,name,rollno,branch,year,password)Values(?,?,?,?,?,?)");   
        pt.setString(1,sap);
        pt.setString(2,name);
        pt.setString(3,rollno);
        pt.setString(4,branch);
        pt.setString(5,year);
        pt.setString(6,pass);
	int x=pt.executeUpdate();
		if(x==1)
		{
                 JOptionPane.showMessageDialog(b16,"Student Added");       
		}
		else
		{
		JOptionPane.showMessageDialog(b16,"Check your internet");
		}  
		pt.close();
       Con.close(); 
      }catch(Exception ex){System.out.println("unknown error");}          
     }
}