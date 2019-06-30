package bin;
import bin.Facultyman;
import bin.Studentman;
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class AfterALogin extends Frame implements ActionListener {
 JLabel l18;
 JRadioButton rb3,rb4;
 JButton b14;               //label-declaration
 public AfterALogin()
 {
 ButtonGroup bg1=new ButtonGroup();
 JFrame f8=new JFrame("Library Management System");
 l18=new JLabel("Welcome To Admin Portal");
 l18.setBounds(110,20, 200,30);
 rb3=new JRadioButton("Student");
 rb3.setBounds(70,100,80,30);
 rb4=new JRadioButton("Faculty");
 rb4.setBounds(200,100,80,30);
 JButton b14=new JButton("Browse");
 b14.setBounds(100,150,100,40);
 b14.addActionListener(this);
 f8.add(rb3);
 f8.add(rb4);
 bg1.add(rb3);
 bg1.add(rb4);
 f8.add(l18);
 f8.add(b14);
 f8.setSize(400,400);  
 f8.setLayout(null);  
 f8.setVisible(true);
 }
public void actionPerformed(ActionEvent e)
     { 
       try{
       if(rb3.isSelected()){
         
      Studentman obj10=new Studentman();    
  }    
  if(rb4.isSelected()){    
      Facultyman obj11=new Facultyman();    
  }
     }
 catch(Exception ex){System.out.println(ex);}
     }
 
}