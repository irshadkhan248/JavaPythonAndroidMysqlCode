//package p3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class D1 extends JFrame{
	Container c;
	JButton btnDate,btnExit;
	D1(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		btnDate=new JButton("Date");
		btnExit=new JButton("Exit");
		c.add(btnDate);
		c.add(btnExit);
		btnDate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Date d =new Date();
				JOptionPane.showMessageDialog(c, d);
			}
		});
		
		ActionListener a1=(ae) -> System.exit(1);
		btnExit.addActionListener(a1);
	}
}
class D1Test{
	public static void main(String args[]){
		D1 d=new D1();
		d.setSize(400,200);
		d.setLocation(500,300);
		d.setTitle("FirstApp");
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setVisible(true);
	}
}