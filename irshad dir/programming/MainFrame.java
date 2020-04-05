import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
	Container c;
	JButton Add;
	
	MainFrame(){
		c=getContentPane();
		Add=new JButton("add");
		c.setLayout(new FlowLayout());
		setSize(450,450);
		setTitle("Student Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MainFrame mf=new MainFrame(); 
		

	}

}
