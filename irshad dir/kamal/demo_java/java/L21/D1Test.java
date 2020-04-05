package p1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class D1 extends JFrame{
	Container c;
	JButton btnDate;
	D1(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		btnDate=new JButton("Date");
		c.add(btnDate);
		ActionListener a1=(ae)->{
			Date d=new Date();
			JOptionPane.showMessageDialog(c,d);
		};
		btnDate.addActionListener(a1);
		setSize(300,300);
		setLocationRelativeTo(null);
		setTitle("Date App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class D1Test{
	public static void main(String args[]){
		D1 d=new D1();
	}
}