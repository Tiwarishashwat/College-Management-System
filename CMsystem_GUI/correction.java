import java.sql.*;
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class Studentman extends Frame implements ActionListener {
 JLabel l19,l21,l22,l23,l24,l25,l26,l27,l28;           //label-declaration
 JTextField tf6,tf7,tf8,tf9,tf10;
 JButton b15,b16,b17,b18;               
 public Studentman()
 {
  JFrame f9=new JFrame("Library Management System");
  l19=new JLabel("Enter sap id");
  l19.setBounds(110,20, 200,30);
  tf6=new JTextField();
  tf6.setBounds(50,50, 250,30);
  b15=new JButton("View");
  b16=new JButton("Add");
  b17=new JButton("Delete");
  b15.setBounds(30,100, 100,30);
  b16.setBounds(130,100, 100,30);
  b17.setBounds(230,100, 100,30);
  b15.addActionListener(this);
  b16.addActionListener(this);
  b17.addActionListener(this);
  f9.add(l21);
  f9.add(l22);
  f9.add(l23);
  f9.add(l24);
  f9.add(l25);
  f9.add(l26);
  f9.add(l27);
  f9.add(l28);
  f9.add(b15);
  f9.add(b16);
  f9.add(b17);
  f9.add(b18);
  f9.add(l19);
  f9.add(tf6);
  f9.add(tf7);
  f9.add(tf8);
  f9.add(tf9);
  f9.add(tf10);
  f9.setSize(400,400);  
  f9.setLayout(null);
  f9.setVisible(true);
}
   public void actionPerformed(ActionEvent e)
   {
 try{
    Class.forName("com.mysql.jdbc.Driver");
  Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagementsystem","root","Stiwari1999");
	Statement stmt=Con.createStatement();
    if(e.getSource()==b15)
         {    
   l21=new JLabel("Name:");
   l21.setBounds(30,150,100,30);
   l22=new JLabel("RollNo:");
   l22.setBounds(30,200,100,30);
   l23=new JLabel("Branch:");
   l23.setBounds(30,250,100,30);
   l24=new JLabel("Year:");
   l24.setBounds(30,300,100,30);
         String sap=tf6.getText();
	ResultSet rs=stmt.executeQuery("Select * from student where sapid='"+sap+"'");
		if(rs.next())
		{
                        l25=new JLabel();
                        l26=new JLabel();
                        l27=new JLabel();
                        l28=new JLabel();
			l25.setText(rs.getString(1));
                        l25.setBounds(130,150,100,30);
                        l26.setText(rs.getString(2));
                        l26.setBounds(130,200,100,30);
                        l27.setText(rs.getString(3));
                        l27.setBounds(130,250,100,30);
                        l28.setText(rs.getString(4));
                        l28.setBounds(130,300,100,30);
		}
		else
		{
			JOptionPane.showMessageDialog(b15,"Student not found");
		}
	    }
 if(e.getSource()==b16)  
  {
   b18=new JButton("SUBMIT");
   b18.setBounds(100,350,100,30);
   l21=new JLabel("Name:");
   l21.setBounds(30,150,100,30);
   l22=new JLabel("RollNo:");
   l22.setBounds(30,200,100,30);
   l23=new JLabel("Branch:");
   l23.setBounds(30,250,100,30);
   l24=new JLabel("Year:");
   l24.setBounds(30,300,100,30);
   tf7=new JTextField();
   tf7.setBounds(130,150,100,30);
   tf8=new JTextField();
   tf8.setBounds(130,200,100,30);
   tf9=new JTextField();
   tf9.setBounds(130,250,100,30);
   tf10=new JTextField();
   tf10.setBounds(130,300,100,30);
         String sap=tf6.getText();
         String name=tf7.getText();
         String rollno=tf8.getText();
         String branch=tf9.getText();
         String year=tf10.getText();
         if(e.getSource()==b18)
         {         
	PreparedStatement pt=Con.prepareStatement("Insert into student(sapid,name,rollno,branch,year)Values(?,?,?,?,?)");
        pt.setString(0,sap);
        pt.setString(1,name);
        pt.setString(2,rollno);
        pt.setString(3,branch);
        pt.setString(4,year);
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
           }
	  		}

 if(e.getSource()==b17)
         {    
         String sap=tf6.getText();	
        int x=stmt.executeUpdate("delete from student where sapid='"+sap+"'");
                if(x==1)
                {
                        JOptionPane.showMessageDialog(b17,"Student record deleted");
                         x=0;
		}
		else
		{
			JOptionPane.showMessageDialog(b17,"Student not found");
		}
		
	    }
		
 Con.close();
}catch(Exception ex)
{
System.out.println("exception spotted");
} 
}
}