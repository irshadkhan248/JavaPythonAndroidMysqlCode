package addToNumber;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class caller {
public static void main(String[] args) {
	x obj=new x();
	
}
}
class x extends JFrame{
	JButton b;
	public x() {
		b=new JButton("Add form");
		add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new Addition();
				dispose();
				// TODO Auto-generated method stub
				
			}
		});
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
	}
	
}
