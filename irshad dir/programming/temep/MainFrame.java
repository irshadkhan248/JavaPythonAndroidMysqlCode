package workProject1;
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
		c.add(Add);
		L1 l=new L1();
		Add.addActionListener(l);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MainFrame mf=new MainFrame(); 
		

	}
	class L1 implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			AddFarme AF=new AddFarme();
			dispose();
			AF.setVisible(true);
		}
	}

}
