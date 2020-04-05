//package wohligProject1;

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
	public UpdateFrame(){
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
		btnUpdateUF.setBounds(90,200,100,30);
		
		btnCancelUF=new JButton("CANCEL");
		c.add(btnCancelUF);
		btnCancelUF.setBounds(200,200,100,30);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		btnUpdateUF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
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
				String name=jtfUpdateName.getText();
				String rno=jtfUpdateRoll.getText();
				String Class=jtfUpdateClass.getText();
				String school=jtfUpdateSchool.getText();
				String s1="update stu set name=?,Class=?,school=? where rno=?";
				
				PreparedStatement pstmt=conn.prepareStatement(s1);
				
				pstmt.setString(1,rno);
				pstmt.setString(2,name);
				pstmt.setString(3,Class);
				pstmt.setString(4,school);
				int b=pstmt.executeUpdate();
				if(b>0)
				JOptionPane.showMessageDialog(c,"record updated");
				else
					JOptionPane.showMessageDialog(c,"record updated");
				
				jtfUpdateName.setText("");
				jtfUpdateRoll.setText("");
				jtfUpdateClass.setText("");
				jtfUpdateSchool.setText("");
				jtfUpdateName.requestFocus();
				}
				catch(NumberFormatException ex2){
					JOptionPane.showMessageDialog(c, "Incorrect input!");
				}
			}
			catch(SQLException ex1){
				System.out.println(ex1);
				JOptionPane.showMessageDialog(c, "connection issue!"+ex1);
			} //end of catch	
			}
		});
		
		btnCancelUF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
	            new MainFrame().setVisible(true);
			}
		});
	}
}