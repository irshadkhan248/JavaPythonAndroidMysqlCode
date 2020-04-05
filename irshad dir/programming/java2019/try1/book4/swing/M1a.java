import javax.swing.*;
import java.awt.*;

class M1a extends JFarme
{
	Container c;
	JButton b1,b2;
	M1a(){
		c=getContentPane();
		b1=new JButton("Click 1");
		b2=new JButton("Click 2");
		c.add(b1);
		c.add(b2);
	}
	public static void main(String args[]){
		M1a f=new M1a();
		f.setSize(200,200);
		f.setTitle("Button Clicked");
		//f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		}
}