import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class FacultyLogin extends Frame implements ActionListener
{
 JPasswordField pf1;
 JButton b12;
 JLabel l12,l13,l14;
 JTextField tf4;
 public FacultyLogin()
 {
  JFrame f5=new JFrame("Library Management System");
  l12=new JLabel("Faculty-Login");
  l13=new JLabel("Sap-Id");  
  l14=new JLabel("Password");
  pf1= new JPasswordField(8);
  tf4=new JTextField();
  l12.setBounds(110,20, 200,30);
  l13.setBounds(30,50, 100,30);
  l14.setBounds(30,100, 100,30);
  tf4.setBounds(130,50, 150,30);  
  pf1.setBounds(130,100, 150,30);
  b12=new JButton("LOGIN");
  b12.setBounds(100,150,100,40);
  b12.addActionListener(this);
   f5.add(b12);
    f5.add(l12);
    f5.add(l13);
    f5.add(tf4);
    f5.add(l14);  
    f5.add(pf1);
    f5.setSize(400,400);  
    f5.setLayout(null);  
    f5.setVisible(true); 
 }
public void actionPerformed(ActionEvent e)
 {
    try{
      String id=tf4.getText();
      char[] password = pf1.getPassword();
      String pass=new String(password);
      if((id.isEmpty())||(pass.isEmpty()));
      {
       JOptionPane.showMessageDialog(this,"Field cannot be blank");
      }
    }
 catch(Exception ex){System.out.println(ex);}
}
}