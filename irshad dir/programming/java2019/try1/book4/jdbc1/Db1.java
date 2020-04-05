import java.sql.*;
class Db1{
	public static void main(String args[]){
		try{
			System.out.println("trying to load drivers");
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			System.out.println("drivers loaded");
			System.out.println("trying to connect");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
			System.out.println("connected");
			System.out.println("trying to close connection");
			conn.close();
			System.out.println("connection closed");
		}catch(Exception e){
			System.out.println("issue "+e);
		}
	}
}