import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class CourseCurriculum extends Frame implements ActionListener
{
 JLabel l6;
 JRadioButton rb1,rb2;
 public CourseCurriculum()
 {
 ButtonGroup bg=new ButtonGroup();
 JFrame f3=new JFrame("College Management System");
 l6=new JLabel("select appropriate department");
 l6.setBounds(110,50,200,60);
 rb1=new JRadioButton("CIT");
 rb1.setBounds(70,100,80,30);
 rb2=new JRadioButton("NON-CIT");
 rb2.setBounds(200,100,80,30);
 JButton b7=new JButton("Browse");
 b7.setBounds(80,150, 170,30);
 b7.addActionListener(this);
 f3.add(l6);
 f3.add(rb1);
 f3.add(rb2);
 bg.add(rb1);
 bg.add(rb2);
 f3.add(b7);
 f3.setSize(400,400);  
 f3.setLayout(null);  
 f3.setVisible(true);
 }
public void actionPerformed(ActionEvent e){    
  if(rb1.isSelected()){    
  JOptionPane.showMessageDialog(this,"CIT");    
  }    
  if(rb2.isSelected()){    
  JOptionPane.showMessageDialog(this,"NON-CIT");    
  }
}    
}  
