//package p2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class E1 extends JFrame{
	Container c;
	JLabel lblNumber;
	JTextField txtNumber;
	JButton btnFind;
	
	E1(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		lblNumber=new JLabel("Enter Number");
		txtNumber=new JTextField(15);
		btnFind=new JButton("Find");
		c.add(lblNumber);
		c.add(txtNumber);
		c.add(btnFind);
		// write code for find ans(Even odd).
		ActionListener a1=(ae)->{
			try{
				int num=Integer.parseInt(txtNumber.getText());
				String msg="";
				if(num%2==0)
					msg="Even";
				else
					msg="odd";
				JOptionPane.showMessageDialog(c,msg);
				
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(c,"invalid input");
				txtNumber.setText("");
				txtNumber.requestFocus();
				
			}
		};
		btnFind.addActionListener(a1);
		setSize(300,400);
		setLocation(500,300);
		setTitle("EO Finder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
class E1Test{
	public static void main(String args[]){
		E1 e=new E1();
	}
}