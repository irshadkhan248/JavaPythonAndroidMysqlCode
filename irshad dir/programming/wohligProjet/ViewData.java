//package wohligProject1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewData extends JFrame {
	Container c;
	JTextArea jtaDataVD;
	JButton btnBackVD;
	public  ViewData() {
		c=getContentPane();
		c.setLayout(null);
		setSize(400,350);
		setTitle("Delete data");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jtaDataVD=new JTextArea(5,10);
		add(jtaDataVD);
		btnBackVD=new JButton("BACK");
		add(btnBackVD);
		btnBackVD.setBounds(140,200,100,30);
		try{
			
			//System.out.println("trying to load drivers");
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			//System.out.println("drivers loaded");
			//System.out.println("trying to connect");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
			//System.out.println("connected");
			//System.out.println("trying to close connection");
			//conn.close();
			//System.out.println("connection closed");
		

				try{// TODO Auto-generated method stub
				// String name=jtfUpdateName.getText();
				// String rno=jtfUpdateRoll.getText();
				// String Class=jtfUpdateClass.getText();
				// String school=jtfUpdateSchool.getText();
				
				Statement s1=conn.createStatement();
				String s2="select * from stu";
				ResultSet rs=s1.executeQuery(s2);
				while(rs.next()){
				String rno=rs.getString(1);
				String name=rs.getString(2);
				String Class=rs.getString(3);
				String school=rs.getString(4);
				System.out.println("rno:"+rno+" name:"+name+" Class:"+Class+" school:"+school);
				String str3="rno:"+rno+" name:"+name+" Class:"+Class+" school:"+school;
				jtaDataVD.setText(str3);
				jtaDataVD.setLineWrap(true);
				jtaDataVD.setWrapStyleWord(true);
				}
				rs.close();
				s1.close();
				conn.close();
				
				}
				catch(NumberFormatException ex2){
					JOptionPane.showMessageDialog(c, "Incorrect input!");
				}
		}
		catch(SQLException ex1 ){
			JOptionPane.showMessageDialog(c, "SQL issue"+ex1);
		}
		btnBackVD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
	            new MainFrame().setVisible(true);
			}
		});
	}
}
