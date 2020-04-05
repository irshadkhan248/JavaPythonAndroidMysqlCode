package p1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class SquareFinder extends JFrame{
	JLabel lblEntNum,result;
	JTextField txtfield;
	JButton answer,clr;
	Container c;
	SquareFinder(){
		c=getContentPane();
		lblEntNum=new JLabel("Enter a Number");
		txtfield=new JTextField(10);
		answer=new JButton("Answer");
		result=new JLabel();
		clr=new JButton("clear all");
		c.add(lblEntNum);
		c.add(txtfield);
		c.add(answer);
		c.add(result);
		c.add(clr);
		c.setLayout(new FlowLayout());
		
		answer.addActionListener(new L2());
		   clr.addActionListener(new L3());
	}
	public static void main(String args[]){
		SquareFinder f=new SquareFinder();
		f.setSize(250,150);
		f.setTitle("Button Click");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	class L2 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			try{
			int a=Integer.parseInt(txtfield.getText());
			float s=a*a;
			result.setText("Square="+s);
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(c,"integer only");
				txtfield.setText("");
				txtfield.requestFocus();
				System.out.println("integer only");}
	}
	}
	
		class L3 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
				txtfield.setText("");
				txtfield.requestFocus();
				result.setText("");
	}
	}
	
	
	}