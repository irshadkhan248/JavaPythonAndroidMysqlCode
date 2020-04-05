import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;

public  class MainFrame extends JFrame{
	Container c;
	Button btnAddMF,btnViewMF,btnUpdateMF,btnDeleteMF;
	MainFrame(){
		c=getContentPane();
		
		c.setLayout( new GridBagLayout() );
		btnAddMF=new Button("ADD");
        c.add(btnAddMF, new GridBagConstraints());
		
		c.setLayout(new FlowLayout());
		///btnAddMF.grid(row=1,col=0);
		
		btnViewMF=new Button("VIEW");
		btnUpdateMF=new Button("UPDATE");
		btnDeleteMF=new Button("DELETE");
		//c.add(btnAddMF);
		c.add(btnViewMF);
		c.add(btnUpdateMF);
		c.add(btnDeleteMF);
		setSize(450,450);
		setTitle("Student Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		L1 l_one=new L1();
		btnAddMF.addActionListener(l_one);	
	}
	
	class L1 implements ActionListener{
	public void actionPerformed(ActionEvent ae){
		
		try{
			dispose();
			AddFrame m = new AddFrame();	
			
			//System.out.println("trying to load drivers");
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			//System.out.println("drivers loaded");
			//System.out.println("trying to connect");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
			//System.out.println("connected");
			//System.out.println("trying to close connection");
			
	
			
		// InputStreamReader isr=new InputStreamReader(System.in);
		// BufferedReader br=new BufferedReader(isr);
		// String s1="insert into stu values(?,?,?,?)";
		// PreparedStatement pstmt=conn.prepareStatement(s1);
		
		// System.out.println("Enter Student roll no");
		// int rno=Integer.parseInt(br.readLine());
		
		// System.out.println("Enter Student name");
		// String name=br.readLine();
		
		// System.out.println("Enter Student class");
		// String Class=br.readLine();
		
		// System.out.println("Enter Student's school name");
		// String school=br.readLine();
		
		// pstmt.setInt(1,rno);
		// pstmt.setString(2,name);
		// pstmt.setString(3,Class);
		// pstmt.setString(4,school);
		// pstmt.executeUpdate();
		
		// System.out.println("data:  name:"+name+"  roll no:"+rno+"  Class:"+Class+"  school:"+school+"  inserted");
			
		}catch(Exception e){
			System.out.println("issue "+e);
		}
		// finally{
			
			// //conn.close();
			// System.out.println("connection closed");
		// }
		
		JOptionPane.showMessageDialog(c,"add Button  is pressed");
	}
}
	
	public static void main(String args[]){
		MainFrame mf=new MainFrame(); 
	}
}
