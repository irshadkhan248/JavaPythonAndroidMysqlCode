import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AddFrame extends JFrame{
	Container c;
	JLabel lblAddRno,lblAddName;
	JTextField txtAddRno,txtAddName;
	JButton btnAddSave,btnAddBack;
	AddFrame(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		lblAddRno=new JLabel("Enter rno");
		lblAddName=new JLabel("Enter name");
		txtAddRno=new JTextField(10);
		txtAddName=new JTextField(10);
		btnAddSave=new JButton("Save");
		btnAddBack=new JButton("Back");
		c.add(lblAddRno);
		c.add(txtAddRno);
		c.add(lblAddName);
		c.add(txtAddName);
		c.add(btnAddSave);
		c.add(btnAddBack);
		ActionListener a1=(ae) -> {
			MainFrame a=new MainFrame();
			dispose();
		};
		btnAddBack.addActionListener(a1);
		ActionListener a2=(ae)->{
			int rno=Integer.parseInt(txtAddRno.getText());
			String name=txtAddName.getText();
			new DbHandler().addStudent(rno,name);
		};
		btnAddSave.addActionListener(a2);
		setSize(250,250);
		setLocationRelativeTo(null);
		setTitle("Add Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}