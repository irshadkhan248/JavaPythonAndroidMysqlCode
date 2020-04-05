package p14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class M1c extends JFrame{
	JButton b1,b2,b3;
	Container c;
	class L1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==b1){
				JOptionPane.showMessageDialog(c,"You clicked Square Button");
			}
			if (ae.getSource()==b2){
				JOptionPane.showMessageDialog(c, "Warning message", "baag bosadk",
        JOptionPane.WARNING_MESSAGE);  
			}
			if(ae.getSource()==b3){
				JOptionPane.showMessageDialog(c, "Error Message", "dar bosadk", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	M1c(){
		
		c=getContentPane();
		b1=new JButton("Square");
		b2=new JButton("cube");
		b3=new JButton("SquareRoot");
		c.setLayout(new FlowLayout());
		c.add(b1);
		c.add(b3);
		c.add(b2);
		setTitle("myClac");
		setSize(200,200);
		setLocationRelativeTo(null);
		setVisible(true);
		L1 a=new L1();
		b1.addActionListener(a);
		b2.addActionListener(a);
		b3.addActionListener(a);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		M1c m1c=new M1c();
	}
}