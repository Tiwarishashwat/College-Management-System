package bin;
import bin.AfterFLogin;
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
import java.sql.*;
public class FacultyLogin extends Frame implements ActionListener
{
 JPasswordField pf;
 JButton b11;
 JLabel l9,l10,l11;
 JTextField tf3;
 public FacultyLogin()
 {
  JFrame f7=new JFrame("Library Management System");
  l9=new JLabel("Student-Login");
  l10=new JLabel("Sap-Id");  
  l11=new JLabel("Password");
  pf= new JPasswordField();
  tf3=new JTextField();
  l9.setBounds(110,20, 200,30);
  l10.setBounds(30,50, 100,30);
  l11.setBounds(30,100, 100,30);
  tf3.setBounds(130,50, 150,30);  
  pf.setBounds(130,100, 150,30);
  b11=new JButton("LOGIN");
  b11.setBounds(100,150,100,40);
  b11.addActionListener(this); 
   f7.add(b11);
    f7.add(l9);
    f7.add(l10);
    f7.add(tf3);
    f7.add(l11);  
    f7.add(pf);
    f7.setSize(400,400);  
    f7.setLayout(null);  
    f7.setVisible(true); 
 }
public void actionPerformed(ActionEvent e) {
 try{
      String id=tf3.getText();
      char[] password = pf.getPassword();
      String pass=new String(password);
      if((id.isEmpty())||(pass.isEmpty()))
      {
       JOptionPane.showMessageDialog(this,"Field cannot be blank");
      }    
      else
      {
       check(id,pass);
      }
    }
 catch(Exception ex){System.out.println(ex);}
 }
public void check(String id,String pass)
	{
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
        Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagementsystem","root","Stiwari1999");
	Statement stmt=Con.createStatement();
	ResultSet rs=stmt.executeQuery("Select password from faculty where id='"+id+"'");
		if(rs.next())
		{
			if(pass.equals(rs.getString(1)))
			{
				student(id);
			}
			else
			{
				JOptionPane.showMessageDialog(this,"wrong password");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this,"user not found");
		}
		stmt.close();
		Con.close();
	    }
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
public void student(String id)
	{
		AfterFLogin ob=new AfterFLogin(id);
	} 
}