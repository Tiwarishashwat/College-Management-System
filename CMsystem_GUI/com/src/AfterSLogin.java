package bin;
import java.sql.*;
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class AfterSLogin extends Frame {     
JLabel l21,l22,l23,l24,l25,l26,l27,l28;
JFrame f9;         
 public AfterSLogin(String sap)
 {
  f9=new JFrame("Library Management System");
  log(sap);
  f9.setSize(400,400);  
  f9.setLayout(null);
  f9.setVisible(true);
 }
 public void log(String sap)
 {
  try
      {
       Class.forName("com.mysql.jdbc.Driver");
       Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagementsystem","root","Stiwari1999");
       Statement stmt=Con.createStatement();
        l21=new JLabel("Name:");
   l21.setBounds(30,150,100,30);
   l22=new JLabel("RollNo:");
   l22.setBounds(30,200,100,30);
   l23=new JLabel("Branch:");
   l23.setBounds(30,250,100,30);
   l24=new JLabel("Year:");
   l24.setBounds(30,300,100,30);
	ResultSet rs=stmt.executeQuery("Select * from student where sapid='"+sap+"'");
		if(rs.next())
		{
                        l25=new JLabel();
                        l26=new JLabel();
                        l27=new JLabel();
                        l28=new JLabel();
			l25.setText(rs.getString(2));
                        l25.setBounds(130,150,100,30);
                        l26.setText(rs.getString(3));
                        l26.setBounds(130,200,100,30);
                        l27.setText(rs.getString(4));
                        l27.setBounds(130,250,100,30);
                        l28.setText(rs.getString(5));
                        l28.setBounds(130,300,100,30);
                        f9.add(l21);
                        f9.add(l22);
                        f9.add(l23);
                        f9.add(l24);
                        f9.add(l25);
                        f9.add(l26);
                        f9.add(l27);
                        f9.add(l28);
                        f9.setSize(600,600);
		}
       Con.close(); 
      }catch(Exception ex){System.out.println("unknown error");}          
     }
}
   