import javax.swing.*;
import java.awt.*;

class M1b extends JFarme
{
	Container c;
	JButton b1,b2;
	M1b(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		b1=new JButton("Click 1");
		b2=new JButton("Click 2");
		c.add(b1);
		c.add(b2);
	}
	public static void main(String args[]){
		M1b f=new M1b();
		f.setSize(200,200);
		f.setTitle("Button Click");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}