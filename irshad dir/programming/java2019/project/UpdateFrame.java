import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;

class UpdateFrame extends JFrame{
	Container c;
	JLabel lblNameUF,lblRollUF,lblClassUF,lblSchoolUF;
	JTextField jtfUpdateName,jtfUpdateRoll,jtfUpdateClass,jtfUpdateSchool;
	JButton btnUpdateUF,btnCancelUF;
	UpdateFrame(){
		c=getContentPane();
		c.setLayout(null);
		setSize(400,350);
		setTitle("Update data");
		setLocationRelativeTo(null);
		setResizable(false);
		
		lblNameUF=new JLabel("Name:");
		c.add(lblNameUF);
		lblNameUF.setBounds(20, 20, 220, 30);
		
		lblRollUF=new JLabel("Roll No:");
		c.add(lblRollUF);
		lblRollUF.setBounds(20, 60, 220, 30);
		
		lblClassUF=new JLabel("Class:");
		c.add(lblClassUF);
		lblClassUF.setBounds(20, 100, 220, 30);
		
		lblSchoolUF=new JLabel("School:");
		c.add(lblSchoolUF);
		lblSchoolUF.setBounds(20,140,220,30);
		
		jtfUpdateName=new JTextField(10);
		c.add(jtfUpdateName);
		jtfUpdateName.setBounds(80,20,220,30);
		
		jtfUpdateRoll=new JTextField(10);
		c.add(jtfUpdateRoll);
		jtfUpdateRoll.setBounds(80,60,220,30);
		
		jtfUpdateClass=new JTextField(10);
		c.add(jtfUpdateClass);
		jtfUpdateClass.setBounds(80,100,220,30);
		
		jtfUpdateSchool=new JTextField(10);
		c.add(jtfUpdateSchool);
		jtfUpdateSchool.setBounds(80,140,220,30);
		
		btnUpdateUF=new JButton("UPDATE");
		c.add(btnUpdateUF);
		btnUpdateUF.setBounds(110,200,80,30);
		
		btnCancelUF=new JButton("CANCEL");
		c.add(btnCancelUF);
		btnCancelUF.setBounds(200,200,80,30);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		UpdateFrame af=new UpdateFrame();
		
	}
}