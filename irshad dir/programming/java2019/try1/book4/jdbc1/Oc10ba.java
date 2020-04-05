//dynamic data insertion.
import java.sql.*;

class Oc10ba{
	public static void main(String args[]){
		try{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
		Statement stmt=conn.createStatement();
		String s1="create table employee(id int primary key,name varchar(50))";
		stmt.executeUpdate(s1);
		System.out.println("Table Created");
		String s2="insert into employee values(1,'amit')";
		stmt.executeUpdate(s2);
		System.out.println("data inserted");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
