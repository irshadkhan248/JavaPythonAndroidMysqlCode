import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Pro1 extends JFrame{
	Container c;
	JButton btnBack,btnLogout;
	TextArea taData;
	Pro1(){
		setResizable(false);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(290,400);
		taData = new TextArea(5,30);
		btnBack = new JButton("Back");
		btnLogout = new JButton("Logout");
		c.add(taData);
		c.add(btnBack);
		c.add(btnLogout);
		setVisible(true);
	}
	public static void main(String args[]){
		Pro1 p=new Pro1();
	}
}