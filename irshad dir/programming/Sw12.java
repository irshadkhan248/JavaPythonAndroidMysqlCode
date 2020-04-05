import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Sw12 extends JFrame{
	Container c;
	JRadioButton rb1,rb2,rb3,rb4;
	JCheckBox cb1,cb2,cb3,cb4,cb5;
	ButtonGroup bg1,bg2;
	JButton b1;
	JPanel p1,p2,p3,p4;
	Sw12(){
		c=getContentPane();
		c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
		p1=new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.setBorder(BorderFactory.createTitle("Bread Types"));
		rb1=new JRadioButton("Wheat Bread(Rs 10.00)");
		rb2=new JRadioButton("MulitiGrain Bread(Rs 15.00)");
		bg1=new ButtonGroup();
		bg1.add(rb1);
		bg2.add(rb2);
		p1.add(rb1);
		p1.add(rb2);
		c.add(p1);
		setSize(350,400);
		setTitle("Sandwich Order");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String args[]){
		Sw12 sw=new Sw12();
	}
}