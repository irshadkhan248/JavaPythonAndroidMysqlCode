package p1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
public class MainFrame extends JFrame{
	Container c;
	JButton btnAdd,btnView;
	MainFrame(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		btnAdd=new JButton("Add");
		btnView=new JButton("View");
		c.add(btnAdd);
		c.add(btnView);
		ActionListener a1=(ae) -> {
			AddFrame a=new AddFrame();
			dispose();
		};
		btnAdd.addActionListener(a1);
		ActionListener a2=(ae) -> {
			ViewFrame a=new ViewFrame();
			dispose();
		};
		btnView.addActionListener(a2);
		
		setSize(250,250);
		setLocationRelativeTo(null);
		setTitle("Student App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String args[]){
		MainFrame m=new MainFrame();
	}
}
class DbHandler{
	public void addStudent(int rno,String name){
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
			String sql="insert into stu_bor_july_2019 values(?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,rno);
			pst.setString(2,name);
			long rid=pst.executeUpdate();
			System.out.println(rid+" records inserted ");
			JOptionPane.showMessageDialog(new JDialog(),rid + " records inserted ");
			conn.close();
		}
		catch(SQLException se){
			System.out.println("issue"+se);
			JOptionPane.showMessageDialog(new JDialog()," issue "+se);
		}
		
	}
	public String viewStudent(){
		StringBuffer sb=new StringBuffer();
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
			String sql="select * from stu_bor_july_2019";
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				int rno=rs.getInt(1);
				String name=rs.getString(2);
				System.out.println(rno+" "+name);
				sb.append(rno+" "+name +"\n");
			}
			rs.close();
			conn.close();
		}
		catch(SQLException se){
			System.out.println("issue"+se);
		}
		return sb.toString();
	}
} 