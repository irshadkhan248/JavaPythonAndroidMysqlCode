import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class M2 extends JFrame 
{
	Container c;
	JButton b1,b2;
	M2()
	{
		c=getContentPane();
		c.setLayout(new FlowLayout());
		b1=new JButton("click 1");
		b2=new JButton("click 2");
		c.add(b1);
		c.add(b2);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				JOptionPane.showMessageDialog(c,"You have clicked Button 1");
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				JOptionPane.showMessageDialog(c,"You have clicked Button 2");
			}
		});
	}
	public static void main(String args[]){
		M2 f=new M2();
		f.setSize(200,200);
		f.setTitle("Button Click");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}