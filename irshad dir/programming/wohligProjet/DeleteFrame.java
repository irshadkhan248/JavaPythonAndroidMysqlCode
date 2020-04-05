//package wohligProject1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class DeleteFrame extends JFrame{
	Container c;
	JLabel lblRollDF;
	JButton detele,cancel;
	JTextField jtfDeleteDF;
	public DeleteFrame(){
		c=getContentPane();
		c.setLayout(null);
		setSize(400,350);
		setTitle("Delete data");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lblRollDF=new JLabel("Roll No:");
		add(lblRollDF);
		lblRollDF.setBounds(20, 60, 220, 30);
		jtfDeleteDF=new JTextField(20);
		add(jtfDeleteDF);
		jtfDeleteDF.setBounds(80,60,220,30);
		detele=new JButton("DELETE");
		add(detele);
		detele.setBounds(90,150,100,30);
		cancel=new JButton("CANCEL");
		add(cancel);
		cancel.setBounds(200,150,100,30);
		
		
		detele.addActionListener(new ActionListener() {
			
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
				
				int rno=Integer.parseInt(jtfDeleteDF.getText());
				
				String s1="delete from stu where rno=?";
				PreparedStatement pstmt=conn.prepareStatement(s1);
				
				pstmt.setInt(1,rno);
				
				pstmt.executeUpdate();
				JOptionPane.showMessageDialog(c,"record deleted");
				jtfDeleteDF.setText("");
				jtfDeleteDF.requestFocus();
				}
				catch(NumberFormatException ex2){
					JOptionPane.showMessageDialog(c, "Incorrect input!");
				}
				
			}
			catch(SQLException ex1){
				JOptionPane.showMessageDialog(c, "connection issue!"+ex1);
			}
				
				
				
			}
		});
		
		
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
	            new MainFrame().setVisible(true);
			}
		});
	}
}
