package p1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class D1 extends JFrame{
Container c;
JButton btnDate;


D1(){
c=getContentPane();
c.setLayout(new FlowLayout());
btnDate=new JButton("Date");
c.add(btnDate);

ActionListener a1=(ae) ->{
Date d=new Date();
JOptionPane.showMessageDialog(c,d);
};
btnDate.addActionListener(a1);
setTitle("Date App");
setSize(200,200);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String args[]){
D1 d=new D1();
}
}