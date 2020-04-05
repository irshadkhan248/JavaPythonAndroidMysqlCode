import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;//for dateformat

class D1 extends JFrame{
Container c;
JButton btnDate,btnTime;
D1(){
c=getContentPane();
c.setLayout(new FlowLayout());
btnDate=new JButton("Date");
btnTime=new JButton("Time");

c.add(btnDate);
c.add(btnTime);
btnDate.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
Date d=new Date();
DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
String s=df.format(d);
JOptionPane.showMessageDialog(c,s);
}
});


btnTime.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
Date d=new Date();
DateFormat df=DateFormat.getTimeInstance(DateFormat.FULL);
String s=df.format(d);
JOptionPane.showMessageDialog(c,s);
}
});
}


public static void main(String args[]){
D1 d=new D1();
d.setSize(250,300);
d.setLocation(300,300);
d.setTitle("Date n Time");
d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
d.setVisible(true);
}
}