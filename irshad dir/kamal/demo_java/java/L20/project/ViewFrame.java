import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ViewFrame extends JFrame{
	Container c;
	TextArea taData;
	JButton btnViewBack;
	ViewFrame(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		taData=new TextArea(10,30);
		btnViewBack=new JButton("Back");
		c.add(taData);
		c.add(btnViewBack);
		String data=new DbHandler().viewStudent();
		taData.setText(data);
		
		ActionListener a1=(ae) -> {
			MainFrame a=new MainFrame();
			dispose();
		};
		btnViewBack.addActionListener(a1);
		setSize(250,250);
		setLocationRelativeTo(null);
		setTitle("View Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}