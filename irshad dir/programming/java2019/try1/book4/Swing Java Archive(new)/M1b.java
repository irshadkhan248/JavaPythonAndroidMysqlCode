package p13;
import javax.swing.*;
import java.awt.*;

class M1b extends JFrame{
	Container c;
	JButton b1,b2;
	
	M1b(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		b1=new JButton("Click 1");
		b2=new JButton("Click 2");
		c.add(b1);
		c.add(b2);
		setSize(200,200);
		setLocation(200,350);
		setTitle("ButtonClick");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])throws NullPointerException{
		M1b m1b=new M1b();
	}
}