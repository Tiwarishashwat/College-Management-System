package bin;
import java.sql.*;
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class VFaculty extends Frame implements ActionListener {
JLabel l19,l21,l22,l23,l24,l25,l26,l27,l28;           //label-declaration
  JTextField tf6;
  JButton b15;              
  JFrame f10=new JFrame("Library Management System");
public VFaculty()
 {
  l19=new JLabel("Enter id");
  l19.setBounds(110,20, 200,30);
  tf6=new JTextField();
  tf6.setBounds(50,50, 250,30);
  b15=new JButton("View");
  b15.setBounds(130,100, 100,30);
  b15.addActionListener(this);
  f10.add(l19);
  f10.add(tf6);
  f10.add(b15);
  f10.setSize(400,400);  
  f10.setLayout(null);
  f10.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  try
      {
       String id=tf6.getText();
       Class.forName("com.mysql.jdbc.Driver");
       Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagementsystem","root","Stiwari1999");
       Statement stmt=Con.createStatement();
        l21=new JLabel("Name:");
   l21.setBounds(30,150,100,30);
   l22=new JLabel("Age:");
   l22.setBounds(30,200,100,30);
   l23=new JLabel("Area of Expertise:");
   l23.setBounds(30,250,200,30);
   l24=new JLabel("Current Batches:");
   l24.setBounds(30,300,100,30);
	ResultSet rs=stmt.executeQuery("Select * from faculty where id='"+id+"'");
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
                        f10.add(l21);
                        f10.add(l22);
                        f10.add(l23);
                        f10.add(l24);
                        f10.add(l25);
                        f10.add(l26);
                        f10.add(l27);
                        f10.add(l28);
                        f10.setSize(600,600);
		}
		else
		{
			JOptionPane.showMessageDialog(b15,"Student not found");
		}
       Con.close(); 
      }catch(Exception ex){System.out.println("unknown error");}          
     }
}