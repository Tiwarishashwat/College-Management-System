package bin;
import bin.AfterALogin;
import java.sql.*;
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class AdminLogin extends Frame implements ActionListener
{
  JPasswordField pf2;
  JButton b13;
  JLabel l15,l16,l17;
  JTextField tf5;
 public AdminLogin()
 {
  JFrame f6=new JFrame("Library Management System");
  l15=new JLabel("Admin-Login");
  l16=new JLabel("Sap-Id");  
  l17=new JLabel("Password");
  pf2= new JPasswordField(8);
  tf5= new JTextField();
  l15.setBounds(110,20, 200,30);
  l16.setBounds(30,50, 100,30);
  l17.setBounds(30,100, 100,30);
  tf5.setBounds(130,50, 150,30);  
  pf2.setBounds(130,100, 150,30);
  b13=new JButton("LOGIN");
  b13.setBounds(100,150,100,40);
  b13.addActionListener(this);
   f6.add(b13);
    f6.add(l15);
    f6.add(l16);
    f6.add(tf5);
    f6.add(l17);  
    f6.add(pf2);
    f6.setSize(400,400);  
    f6.setLayout(null);  
    f6.setVisible(true); 
 }
public void actionPerformed(ActionEvent e)
     {
      try{
     if(e.getSource()==b13)
     {
      String user=tf5.getText();
      char[] password = pf2.getPassword();
      String pass=new String(password);
      if((user.isEmpty())||(pass.isEmpty()))
      {
       JOptionPane.showMessageDialog(this,"Field cannot be blank");
      }
      else
      {
       check(user,pass);
      }
     }
    }
 catch(Exception ex){System.out.println(ex);}
     }
 public void check(String user,String pass)
	{
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
        Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagementsystem","root","Stiwari1999");
	Statement stmt=Con.createStatement();
	ResultSet rs=stmt.executeQuery("Select password from adminlogin where username='"+user+"'");
		if(rs.next())
		{
			if(pass.equals(rs.getString(1)))
			{
				admin(user);
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
public void admin(String user)
	{
		AfterALogin ob=new AfterALogin();
	} 
}