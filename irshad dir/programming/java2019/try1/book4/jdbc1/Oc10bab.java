import java.sql.*;
import java.io.*;
class Oc10bab{
	public static void main(String args[]){
		try{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
		//String str1="create table student(id int primary key,name varchar(50))";
		Statement stmt=conn.createStatement();
		//stmt.executeUpdate(str1);
		System.out.println("Table Created ");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s1="insert into student values(?,?)";
		PreparedStatement pstmt=conn.prepareStatement(s1);
		System.out.println("Enter Student Id");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter Student Id");
		String name=br.readLine();
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.executeUpdate();
		System.out.println("data: name="+name+" id="+id+" inserted");
		String s2="select*from student";
		ResultSet rs=stmt.executeQuery(s2);
		while(rs.next()){
			int r=rs.getInt(1);
			String n=rs.getString(2);
			System.out.println(r+" "+n);
		}
		rs.close();
		stmt.close();
		pstmt.close();
		conn.close();
		
		}
		catch(Exception e){
			System.out.println("issue"+e);
			}
		}
	}