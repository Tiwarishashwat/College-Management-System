import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class Home extends Frame {
 JLabel l,l1;           //label-declaration
 JButton b1,b2,b3,b4;  //Button-declaration
 Home()
 {
   JFrame f = new JFrame("College Management System");
    l = new JLabel("College Management System");
    l.setBounds(110, 20, 200, 30);
    l1 = new JLabel();
    l1.setBounds(30, 250, 100, 30);
    JButton b1 = new JButton("Student-Details");
    JButton b2 = new JButton("Faculty-Details");
    JButton b3 = new JButton("Course-Curriculum");
    JButton b4 = new JButton("E-portal");
    b1.setBounds(80, 50, 170, 30);
    b2.setBounds(80, 100, 170, 30);
    b3.setBounds(80, 150, 170, 30);
    b4.setBounds(80, 200, 170, 30);
    b1.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
     {
          StudentDetails obj1=new StudentDetails();
     }
    });
    b2.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
     {
       FacultyDetails obj2=new FacultyDetails();
     }
    });
    b3.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
     {
       CourseCurriculum obj3=new CourseCurriculum();
     }
    });
    b4.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
     {
         Eportal obj4=new Eportal();
     }
    });
    f.add(l);
    f.add(l1);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.setSize(400, 400);
    f.setLayout(null);
    f.setVisible(true);
 }  
 public static void main(String[] args) {
 new Home();
 }
}