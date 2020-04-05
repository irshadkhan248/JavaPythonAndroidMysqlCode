///craete table in database.
import java.sql.*;

class Oc10b{
	public static void main(String args[]){
		try{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
		Statement stmt1=conn.createStatement();
		String s1="create table employee11(empid int primary key,ename varchar(50))";
		stmt1.executeUpdate(s1);
		String s2="insert into employee1 values(10,'sumit')";
		System.out.println("rows inserted");
		stmt1.executeUpdate(s2);
		stmt1.close();
		conn.close();
		}catch(SQLException e){System.out.println(e);}
	}
}