///package wohligProject1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public  class AddFrame extends JFrame{
	Container c;
	JLabel lblNameAF,lblRollAF,lblClassAF,lblSchoolAF;
	JTextField jtfAddName,jtfAddRoll,jtfAddClass,jtfAddSchool;
	JButton btnSaveAF,btnBackAF;
	public AddFrame(){
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
		
		
		
        //////////save JButton Listener. 
		btnSaveAF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
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
				String name=jtfAddName.getText();
				int rno=Integer.parseInt(jtfAddRoll.getText());
				String Class=jtfAddClass.getText();
				String school=jtfAddSchool.getText();
				String s1="insert into stu values(?,?,?,?)";
				PreparedStatement pstmt=conn.prepareStatement(s1);
				
				pstmt.setInt(1,rno);
				pstmt.setString(2,name);
				pstmt.setString(3,Class);
				pstmt.setString(4,school);
				pstmt.executeUpdate();
				JOptionPane.showMessageDialog(c,"data inserted");
				jtfAddName.setText("");
				jtfAddRoll.setText("");
				jtfAddClass.setText("");
				jtfAddSchool.setText("");
				jtfAddName.requestFocus();
				}
				catch(NumberFormatException ex2){
					JOptionPane.showMessageDialog(c, "Incorrect input!");
				}
				
			}
			catch(SQLException ex1){
				JOptionPane.showMessageDialog(c, "connection issue!");
			} //
			}
		});
		
		////////back JButton Listener.
		btnBackAF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
	            new MainFrame().setVisible(true);
			}
		});
	}
}