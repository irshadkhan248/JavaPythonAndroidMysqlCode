import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;

public  class AddFrame extends JFrame{
	Container c; AddFrame
	JLabel lblNameAF,lblRollAF,lblClassAF,lblSchoolAF;
	JTextField jtfAddName,jtfAddRoll,jtfAddClass,jtfAddSchool;
	JButton btnSaveAF,btnBackAF;
	AddFrame(){
		c=getContentPane();
		c.setLayout(null);
		setSize(400,350);
		setTitle("Insert data");
		setLocationRelativeTo(null);
		setResizable(false);
		
		lblNameAF=new JLabel("Name:");
		c.add(lblNameAF);
		lblNameAF.setBounds(20, 20, 220, 30);
		
		lblRollAF=new JLabel("Roll No:");
		c.add(lblRollAF);
		lblRollAF.setBounds(20, 60, 220, 30);
		
		lblClassAF=new JLabel("Class:");
		c.add(lblClassAF);
		lblClassAF.setBounds(20, 100, 220, 30);
		
		lblSchoolAF=new JLabel("School:");
		c.add(lblSchoolAF);
		lblSchoolAF.setBounds(20,140,220,30);
		
		jtfAddName=new JTextField(10);
		c.add(jtfAddName);
		jtfAddName.setBounds(80,20,220,30);
		
		jtfAddRoll=new JTextField(10);
		c.add(jtfAddRoll);
		jtfAddRoll.setBounds(80,60,220,30);
		
		jtfAddClass=new JTextField(10);
		c.add(jtfAddClass);
		jtfAddClass.setBounds(80,100,220,30);
		
		jtfAddSchool=new JTextField(10);
		c.add(jtfAddSchool);
		jtfAddSchool.setBounds(80,140,220,30);
		
		btnSaveAF=new JButton("SAVE");
		c.add(btnSaveAF);
		btnSaveAF.setBounds(110,200,80,30);
		
		btnBackAF=new JButton("BACK");
		c.add(btnBackAF);
		btnBackAF.setBounds(200,200,80,30);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// public static void main(String args[]){
		// AddFrame af=new AddFrame();
		
	// }
}