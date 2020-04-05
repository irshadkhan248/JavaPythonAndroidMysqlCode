package workProject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddFarme extends JFrame{
	Container c;
	JLabel lblNameUF;
	public AddFarme(){
		c=getContentPane();
		lblNameUF=new JLabel("hi iam AddFrame");
		c.setLayout(new FlowLayout());
		setSize(450,450);
		setTitle("Add Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		c.add(lblNameUF);
	}
	//public static void main(String[] args) {
		//AddFarme AF=new AddFarme();
	//}
}
